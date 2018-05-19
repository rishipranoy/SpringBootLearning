package com.learning.people.manage.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.people.manage.application.dao.PeopleManagementDao;
import com.learning.people.manage.application.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;
	
	public Person createPerson(Person person) {
		return peopleManagementDao.save(person);
	}

	public  Iterable<Person> createPersons(List<Person> personList) {
		return peopleManagementDao.save(personList);
	}

	public Iterable<Person> getPersonById(List<Integer> ids) {	
		return peopleManagementDao.findAll(ids);
	}

	public void deletePersonEntity(Person person) {
		peopleManagementDao.delete(person);
	}

	public Person updatePersonEmailById(Integer id, String email) {
		
		Person person = peopleManagementDao.findOne(id);
		person.setEmail(email);
		return peopleManagementDao.save(person);
	}

	
}
