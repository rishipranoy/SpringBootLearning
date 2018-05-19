package com.learning.people.manage.application.dao;

import org.springframework.data.repository.CrudRepository;

import com.learning.people.manage.application.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

}
