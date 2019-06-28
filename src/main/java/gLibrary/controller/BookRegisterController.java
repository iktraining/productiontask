package gLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import gLibrary.domain.books.Book;
import gLibrary.domain.books.publishers.Publisher;
import gLibrary.domain.books.techniquelevels.TechniqueLevel;
import gLibrary.domain.users.departments.Department;
import gLibrary.domain.validationgroup.GroupOrder;
import gLibrary.service.BookService;
import gLibrary.service.DepartmentService;
import gLibrary.service.PublisherService;
import gLibrary.service.TechniqueLevelService;

@Controller
@SessionAttributes(value="book")
public class BookRegisterController {
	@Autowired
	BookService bookService;
	@Autowired
	PublisherService publisherService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	TechniqueLevelService techniqueLevelService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	@GetMapping("/bookregister")
	public String getBookRegesterForm(Book book, Model model) {
		model.addAttribute("departmentList", departmentService.findDepartmentList());
		model.addAttribute("techniqueLevelList", techniqueLevelService.findTechniqueLevelList());

		return "bookregister";
	}

	@GetMapping("/bookregisterconfirmation")
	public String getBookRegesterForm(){
		return "redirect:/bookregister";
	}

	@PostMapping("/bookregisterconfirmation")
	public String postBookRegesterForm(@ModelAttribute @Validated(GroupOrder.class) Book book, BindingResult bindingResult, Model model) {
		model.addAttribute("departmentNames", departmentService
				.findDepartmentNames(book.getRecommendedDepartment().getDepartmentList()));
		model.addAttribute("grades", techniqueLevelService.findGrades(book.getTechniqueLevelList()));

		// 類似出版社該当メッセージを出す
		List<Publisher> similarPublishers=
				publisherService.likeSearchPublishName(book.getPublisher().getPublisherName().getName());
		if(!similarPublishers.isEmpty()) {
			model.addAttribute("similarPublishers", similarPublishers);
		}
		// 登録済みの本というメッセージを出す
		if(null != book.getIsbn().getIsbn()) {
			if(bookService.hasBook(book.getIsbn())) {
				model.addAttribute("registeredIsbn", Boolean.valueOf(bookService.hasBook(book.getIsbn())));
				return getBookRegesterForm(book, model);
			}
		}
		if(bindingResult.hasErrors()) {
			return getBookRegesterForm(book, model);
		}
		return "bookregisterconfirmation";
	}

	@PostMapping(value="/bookregister", params="modify")
	public String postModify(Book book, Model model) {
		return getBookRegesterForm(book, model);
	}

	@PostMapping(value="/bookregister", params="register")
	public String postBookRegester(@Validated(GroupOrder.class) Book book, BindingResult bindingResult, Model model) {
		// 出版番号聞く
		Publisher publisher =  publisherService.findPublisherNumber(book.getPublisher());
		if(null == publisher) {
			//なかったら出版社新規登録
			publisherService.register(book.getPublisher());
			publisher =  publisherService.findPublisherNumber(book.getPublisher());
		}
		// 出版番号,名称いれて本登録
		bookService.register(book, publisher);
		// 紹介文登録
		if(null != book.getBookDescription().getDiscriptionText().getText()) {
			bookService.registerDescription(book);
		}
		// 書影登録
		if(null != book.getBookImage().getImageUri().getUri()) {
			bookService.registerBookImage(book);
		}
		// 推薦部署登録
		boolean isNotEmptyDepartmentCode = false;
		for(Department department:book.getRecommendedDepartment().getDepartmentList().getDepartmentList()) {
			if(null != department.getDepartmentCode().getCode()) {
				isNotEmptyDepartmentCode = true;
				break;
			}
		}
		if(isNotEmptyDepartmentCode) {
			bookService.registerRecommendedDepartment(book);
		}
		// 技術レベル登録
		boolean isNotEmptyTechniqueRank = false;
		for(TechniqueLevel techniqueLevel: book.getTechniqueLevelList().getTechniqueLevelList()) {
			if(null != techniqueLevel.getTechniqueRank().getRank()) {
				isNotEmptyTechniqueRank = true;
				break;
			}
		}
		if(isNotEmptyTechniqueRank) {
			bookService.registerBookLevel(book);
		}

		return "bookregistercomplete";
	}
}
