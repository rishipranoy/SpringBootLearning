package com.learning.people.manage.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.people.manage.application.dao.PeopleManagementDao;
import com.learning.people.manage.application.entities.Person;

@Service
public class PeopleManagementService {

	/* A Proxy Class for this Inferface gets created in Spring for this data JPA
	 *  and that gets injected into PeopleManagementDao
	 */
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> getPersonInfoByLastName(String lastName) {
		
		return peopleManagementDao.getPersonByLastName(lastName);
	}

	public Iterable<Person> createPerson(List<Person> personList) {
		
		return peopleManagementDao.save(personList);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {

		return peopleManagementDao.findByFirstNameAndEmail(firstName, email);
	}

	public List<Person> getPersonInfoByLastNameAndEmail(String lastName, String email) {
	
		return peopleManagementDao.getPersonByLastNameAndEmail(lastName, email);
	}
	

	
}
