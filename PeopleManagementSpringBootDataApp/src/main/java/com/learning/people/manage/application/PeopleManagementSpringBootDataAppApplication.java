package com.learning.people.manage.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.people.manage.application.entities.Person;
import com.learning.people.manage.application.service.PeopleManagementService;




//BootStrap class
@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication  implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;  
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createPerson();
		//createPersons();	
		//getPersonByIds();
		//deletePersonEntity();
		updatePersonEmailById(1, "lanka@gmail.com");
	}

	private void updatePersonEmailById(Integer id, String email) {
	
		Person person = peopleManagementService.updatePersonEmailById(id, email);
		System.out.println(person);
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(2);
		peopleManagementService.deletePersonEntity(person);
	}

	private void createPersons() {
	List <Person> personList = Arrays.asList(new Person("Pranay", "Rishi", "rishi@123.com", new Date()),
			new Person("Kotwali", "pranay", "krpranay@gmail.com", new Date()));
	Iterable<Person> createPersons = peopleManagementService.createPersons(personList);
	createPersons.forEach(System.out::println);
	}

	private void createPerson() {
		
		Person person = new Person("Rishi", "Pranoy", "rishipranay@gmail.com", new Date());
		
		Person personDb = peopleManagementService.createPerson(person);
		
		System.out.println(personDb);
	}
	
	private void getPersonByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		Iterable<Person> personList = peopleManagementService.getPersonById(ids);
		personList.forEach(System.out::println);
	}
}
