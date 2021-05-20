package ru.akvine.PopulationRegistry.controllers;

import ru.akvine.PopulationRegistry.service.PersonService;
import ru.akvine.PopulationRegistry.service.impl.PersonServiceImpl;
import ru.akvine.PopulationRegistry.models.Person;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	private PersonService personService = new PersonServiceImpl();
	
	
	@RequestMapping("/index")
	public String getRedirect() {
		return "redirect:/list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(Model model) {
		List<Person> people = personService.getPopulationList();
		model.addAttribute("people", people);
		
		System.out.println(people);
		
		return "list";
	}
}
