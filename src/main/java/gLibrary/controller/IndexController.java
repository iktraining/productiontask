package gLibrary.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import gLibrary.domain.books.criteria.BookSearchCriteria;
import gLibrary.service.DepartmentService;
import gLibrary.service.TechniqueLevelService;

@Controller
public class IndexController {
	@Autowired
	DepartmentService departmentService;
	@Autowired
	TechniqueLevelService techniqueLevelService;
	@Autowired
	HttpSession session;

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@GetMapping("/logout")
	public String getLogout() {
		return "login";
	}

	@GetMapping("/index")
	public String getIndex(@ModelAttribute BookSearchCriteria bookSearchCriteria, Model model) {
		session.removeAttribute("book");
		model.addAttribute("departmentList", departmentService.findDepartmentList());
		model.addAttribute("techniqueLevelList", techniqueLevelService.findTechniqueLevelList());
		return "index";
	}
}
