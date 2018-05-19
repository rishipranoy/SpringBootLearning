package com.learning.people.manage.application;

import java.util.ArrayList;
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
	
		//createPersons()
		
		createNamedQueryMethods();
		
	
	}

	private void createNamedQueryMethods() {
		getPersonInfoByLastName("Rishi");
		
		//getPersonInfoByFirstNameAndEmail("Sony", "Sony@gmail.com");
	}

	private void getPersonInfoByFirstNameAndEmail(String firstName, String email) {
	
		List <Person> personsList = peopleManagementService.getPersonInfoByFirstNameAndEmail(firstName, email);
		 
		 personsList.forEach(System.out::println);
		
	}

	private void createPersons() {	
		List <Person> personList = new ArrayList<>();
		Person p1 = new Person("Rishi", "kotwali", "rishi@gmail.com", new Date());
		Person p2 = new Person("Pranay", "Kamal", "pranay@gmail.com", new Date());
		Person p3 = new Person("vamshi", "Mittu", "vamshi@gmail.com", new Date());
		Person p4 = new Person("Prabhakar", "Sunny", "Prabhakar@gmail.com", new Date());
		Person p5 = new Person("Sujatha", "Prakash", "Sujatha@gmail.com", new Date());
		Person p6 = new Person("Sony", "Kumar", "Sony@gmail.com", new Date());
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		
		Iterable<Person> personList2 = peopleManagementService.createPerson(personList);
		personList2.forEach(System.out::println);
		
		
	}

	private void getPersonInfoByLastName(String lastName) {
	
		 List <Person> personsList = peopleManagementService.getPersonInfoByLastName(lastName);
		 
		 personsList.forEach(System.out::println);
	}

	
}
