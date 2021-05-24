package ru.akvine.PopulationRegistry.controllers;

import ru.akvine.PopulationRegistry.service.PersonService;
import ru.akvine.PopulationRegistry.models.DateValidator;
import ru.akvine.PopulationRegistry.models.Person;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class ListController {
	
	private PersonService personService;
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("/delete/{id}")
	public String deletePerson(@PathVariable("id") int id, Model model) {
		this.personService.deletePerson(id);
		
		return "redirect:/people";
	}
	
	
	@GetMapping("/add")
	public String getAdd() {
		
		return "add";
	}
	
	@PostMapping("/add/person")
	public String addPerson(@Valid @ModelAttribute("person")  Person person, BindingResult result) throws Exception {
		boolean validation = person.getFirstName().isEmpty() || person.getSecondName().isEmpty() || 
				person.getBirthDate().isEmpty() || DateValidator.isValid(person.getBirthDate()) ;
 		
		if(result.hasErrors() || validation) {
			return "redirect:/people";
		} else {
			this.personService.addPerson(person);
		}
		
		return "redirect:/people";
	}
	
	@GetMapping("/edit")
	public String getEdit() {
		
		return "edit";
	}
	
	@RequestMapping(value = "/edit/person", method = RequestMethod.POST)
	public String editPerson(@ModelAttribute("person") Person person) {
		try {
			this.personService.editPerson(person);
		} catch (Exception e) {
			return "redirect:/people";
		}
		
		return "redirect:/people";
	}
	
	
	@GetMapping("/people")
	public String getList(Model model) {
		List<Person> people = personService.getPopulationList();
		
		model.addAttribute("people", people);
		return "people";
	}
	
	@GetMapping("/index")
	public String redirect() {
		return "people";
	}
	
	@GetMapping("/person/{id}") 
	public String getById(@RequestParam("id") int id, Model model) {
		Person person = this.personService.getById(id);
		model.addAttribute("people", person);
		
		return "people";
	}
}
