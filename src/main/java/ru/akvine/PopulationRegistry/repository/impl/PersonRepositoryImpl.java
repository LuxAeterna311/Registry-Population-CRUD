package ru.akvine.PopulationRegistry.repository.impl;
import java.util.List;

import ru.akvine.PopulationRegistry.models.Person;
import ru.akvine.PopulationRegistry.repository.PersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	private static Logger logger = LoggerFactory.getLogger(Person.class);
	
	
	@Override
	public List<Person> getPopulationList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
