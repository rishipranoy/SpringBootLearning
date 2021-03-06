package com.learning.people.manage.application.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.learning.people.manage.application.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

	public List<Person> getPersonByLastName(String lastname); 
	
	public List<Person> findByFirstNameAndEmail(String firstname, String lastname);
	
	public List<Person> getPersonByLastNameAndEmail(String firstname, String lastname);

}
