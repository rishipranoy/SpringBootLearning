package com.learning.book.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.book.ticket.entities.Ticket;
import com.learning.book.ticket.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/ticket")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value = "/getTicketById/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);

	}
	@GetMapping(value = "/getAllTickets")
	public Iterable<Ticket> getAllTickets() {		
		return ticketBookingService.getAllTickets();
	}
	
	
	@DeleteMapping(value ="/deleteTicketById/{ticketId}")
	public void deleteTicketById(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicketById(ticketId);
	}
	
	@PutMapping(value = "/updateTicket")
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.updateTicket(ticket);
	}
	
	@DeleteMapping(value = "/deleteAll")
	public void deleteAllTickets() {
		ticketBookingService.deleteAllTickets();
	}
	
}
