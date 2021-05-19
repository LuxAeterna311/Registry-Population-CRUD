package ru.akvine.PopulationRegistry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String getRedirect() {
		return "redirect:/list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(Model model) {
		System.out.println("Hello, controller!");
		
		model.addAttribute("path", "hello world");
		return "list";
	}
}
