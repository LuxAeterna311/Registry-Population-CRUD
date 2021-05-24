package ru.akvine.PopulationRegistry.service;

import java.util.List;
import ru.akvine.PopulationRegistry.models.Person;

public interface PersonService {
	List<Person> getPopulationList();
	void addPerson(Person person);
	void deletePerson(int id);
	void editPerson(Person person) throws Exception;
	Person getById(int id);
}
