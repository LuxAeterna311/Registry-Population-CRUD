package ru.akvine.PopulationRegistry.repository;
import java.util.List;
import ru.akvine.PopulationRegistry.models.Person;

public interface PersonRepository {
	List<Person> getPopulationList();
	void addPerson(Person person);
	void deletePerson(int id);
	void editPerson(Person person);
	Person getById(int id);
}
