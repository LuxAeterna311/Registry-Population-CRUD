package ru.akvine.PopulationRegistry.controllers;

import ru.akvine.PopulationRegistry.service.PersonService;
import ru.akvine.PopulationRegistry.service.impl.PersonServiceImpl;
import ru.akvine.PopulationRegistry.models.Person;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ListController {
	
	private PersonService personService;
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deletePerson(@PathVariable("id") int id, Model model) {
		this.personService.deletePerson(id);
		
		return "redirect:/list";
	}
	
	// @RequestMapping(value = "/add", method = RequestMethod.POST)
	
	@PostMapping("/add")
	public String addPrson(@ModelAttribute("person") Person person) {
		this.personService.addPerson(person);
		
		return "redirect:/list";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editPerson() {
		
		return "/edit";
	}
	
	
	@GetMapping("/list")
	public String getList(Model model) {
		List<Person> people = personService.getPopulationList();
		
		model.addAttribute("people", people);
		return "list";
	}
}
