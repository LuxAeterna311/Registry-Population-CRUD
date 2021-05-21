package ru.akvine.PopulationRegistry.controllers;

import ru.akvine.PopulationRegistry.models.Person;
import ru.akvine.PopulationRegistry.service.PersonService;
import ru.akvine.PopulationRegistry.service.impl.PersonServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class EditController {
	
	private PersonService personService;
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping(value="/editperson", method=RequestMethod.POST)
	public String editPerson(@ModelAttribute("person") Person person) {
		this.personService.editPerson(person);
		
		return "/list";
	}
}
