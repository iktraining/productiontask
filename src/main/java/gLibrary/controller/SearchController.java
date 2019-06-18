package gLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import gLibrary.domain.books.BookList;
import gLibrary.domain.books.criteria.BookSearchCriteria;
import gLibrary.service.DepartmentService;
import gLibrary.service.SearchService;
import gLibrary.service.TechniqueLevelService;

@Controller
public class SearchController {
	@Autowired
	DepartmentService departmentService;
	@Autowired
	TechniqueLevelService techniqueLevelService;
	@Autowired
	SearchService searchService;

	/*private Map<String, String> getCheckBoxItems(){
		Map<String, String> selectMap = new LinkedHashMap<String, String>();
		//DBから値を入れ込む

		return selectMap;
	}*/

	@PostMapping("/search")
	public String postSearch(@ModelAttribute BookSearchCriteria bookSearchCriteria, Model model) {
		//TODO Search Service
		//TODO keyword
		BookList bookList = searchService.keywordSearch(bookSearchCriteria.getKeywordCriteria().getKeyword());
		model.addAttribute("bookList", bookList);
		//TODO 再検索時エラー起きる
		model.addAttribute("departmentList", departmentService.findDepartmentList());
		model.addAttribute("techniqueLevelList", techniqueLevelService.findTechniqueLevelList());
		return "searchresult";
	}

	@GetMapping("/search")
	public String getSearch() {
		return "redirect:/index";
	}
}
