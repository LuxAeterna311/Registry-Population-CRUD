package ru.akvine.PopulationRegistry.service.impl;

import ru.akvine.PopulationRegistry.models.Person;
import ru.akvine.PopulationRegistry.service.PersonService;
import ru.akvine.PopulationRegistry.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonRepository personRepository;
	
	@Autowired
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> getPopulationList() {
		return this.personRepository.getPopulationList();
	}

	@Override
	public void addPerson(Person person) {
		this.personRepository.addPerson(person);
	}

	@Override
	public void deletePerson(int id) {
		this.personRepository.deletePerson(id);
		
	}

	@Override
	public void editPerson(Person person) {
		this.personRepository.editPerson(person);
		
	}

	@Override
	public Person getById(int id) {
		return this.personRepository.getById(id);
	}
	
}
