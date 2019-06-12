package gLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gLibrary.service.DepartmentService;

@Controller
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class IndexController {
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@GetMapping("/logout")
	public String getLogout() {
		return "login";
	}

	@GetMapping("/index")
	public String showIndex(Model model) {
		model.addAttribute("departmentList", departmentService.findDepartmentList());
		return "index";
	}
}
