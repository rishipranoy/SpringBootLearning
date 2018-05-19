package com.learning.book.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.book.ticket.dao.TicketBookingDAO;
import com.learning.book.ticket.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDAO ticketBookingDAO;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDAO.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDAO.findOne(ticketId);
	}

	public Iterable<Ticket> getAllTickets() {
		return ticketBookingDAO.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
		 ticketBookingDAO.delete(ticketId);
	}

	public Ticket updateTicket(Ticket ticket) {
//		Ticket oldTicket = ticketBookingDAO.findOne(ticket.getTicketId());
//		Ticket newTicket = new Ticket();
//		newTicket.setTicketId(ticket.getTicketId());
//	
		return ticketBookingDAO.save(ticket);
	}

	public void deleteAllTickets() {
		ticketBookingDAO.deleteAll();
	}
}
