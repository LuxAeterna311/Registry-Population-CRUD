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
		Person human1 = new Person();
		human1.setId(AUTO_ID.getAndIncrement());
		human1.setFirstName("Jack");
		human1.setSecondName("Doom");
		human1.setThirdName("Lul");
		human1.setAge(23);
		human1.setBirthDate("03-07-2001");
		
		Person human2 = new Person();
		human2.setId(AUTO_ID.getAndIncrement());
		human2.setFirstName("Ivan");
		human2.setSecondName("Gaika");
		human2.setThirdName("Olegovich");
		human2.setAge(16);
		human2.setBirthDate("02-11-2005");
		
		Person human3 = new Person();
		human3.setId(AUTO_ID.getAndIncrement());
		human3.setFirstName("Acho");
		human3.setSecondName("Vsmisle");
		human3.setThirdName("Inoske");
		human3.setAge(36);
		human3.setBirthDate("21-09-1991");
		
		
		
		people.put(human1.getId(), human1);
		people.put(human2.getId(), human2);
		people.put(human3.getId(), human3);
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
