package ru.akvine.PopulationRegistry.repository.impl;
import java.util.List;

import ru.akvine.PopulationRegistry.models.Person;
import ru.akvine.PopulationRegistry.repository.PersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	private static Logger logger = LoggerFactory.getLogger(Person.class);
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Person> getPopulationList() {
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Person", Person.class).list();
	}

	@Override
	public void addPerson(Person person) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(person);
	}

	@Override
	public void deletePerson(int id) {
		Session session = sessionFactory.getCurrentSession();
		Person gettedPerson = getById(id);
		
		session.delete(gettedPerson);
	}

	@Override
	public void editPerson(Person person) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(person);
	}

	@Override
	public Person getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Person.class, id);
	}
	
}
