package ru.akvine.PopulationRegistry.repository.impl;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import ru.akvine.PopulationRegistry.models.Person;
import ru.akvine.PopulationRegistry.repository.PersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	private static Logger logger = LoggerFactory.getLogger(Person.class);
	private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
	private static Map<Integer, Person> people = new HashMap<>();
	
	
	static {
		Person human = new Person();
		human.setId(AUTO_ID.getAndIncrement());
		human.setAge(15);
		human.setBirthDate("2001-03-07");
		human.setPostal("141301");
		
		people.put(human.getId(), human);
	}
	
	
	@Override
	public List<Person> getPopulationList() {
		return new ArrayList<>(people.values());
	}

	@Override
	public void addPerson(Person person) {
		person.setId(AUTO_ID.getAndIncrement());
		people.put(person.getId(), person);
	}

	@Override
	public void deletePerson(int id) {
		people.remove(id);
	}

	@Override
	public void editPerson(Person person) {
		people.put(person.getId(), person);
	}

	@Override
	public Person getById(int id) {
		return people.get(id);
	}
	
}
