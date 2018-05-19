package com.learning.book.ticket;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.learning.book.ticket.entities.Ticket;
import com.learning.book.ticket.service.TicketBookingService;

@SpringBootApplication 
@ComponentScan
		//basePackages = {"com.learning.book.ticket.dao", "com.learning.book.ticket.service"})

// (scanBasePackages = {"com.learning.book.ticket"})

// @EntityScan("com.learning.book.ticket")
//@EnableJpaRepositories({ "com.learning.book.ticket.dao" })
public class TicketBookingManagementAppApplication {

	@Autowired
	TicketBookingService ticketBookingService;
	
	@Autowired
	DataSource dataSource;
	
	public static void main(String[] args) {
		
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
//		
//		TicketBookingService ticketBookingService = applicationContext.getBean(TicketBookingService.class);

		SpringApplication.run(TicketBookingManagementAppApplication.class);
		// TicketBookingService ticketBookingService = new TicketBookingService();
//		SpringApplication app = new SpringApplication(TicketBookingManagementAppApplication.class);
//		app.run(args);	
//		ticketBookingService.createTicket(bookTicket());
//		TicketBookingManagementAppApplication appApplication = new TicketBookingManagementAppApplication();
//		appApplication.bookTicket();
	}

	private static Ticket bookTicket() {
		Ticket ticket = new Ticket();
		ticket.setPassengerName("RishiPranoy");
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("Bangalore");
		ticket.setDestinationStation("Hyderabad");
		ticket.setEmail("rishi@gmail.com");
		return ticket;
	}

//	@Override
//	public void run(String... arg0) throws Exception {
//		Ticket ticket = new Ticket();
//		ticket.setPassengerName("RishiPranoy");
//		ticket.setBookingDate(new Date());
//		ticket.setSourceStation("Bangalore");
//		ticket.setDestinationStation("Hyderabad");
//		ticket.setEmail("rishi@gmail.com");
//		ticketBookingService.createTicket(ticket);		
//		System.out.println("DataSource:" + dataSource);
//	}
}

/**
 * 
 * Basic Crud Operations in SpringBoot using Embedded Databases
 * 
 */


