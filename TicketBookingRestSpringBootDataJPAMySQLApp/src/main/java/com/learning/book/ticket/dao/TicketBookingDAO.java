package com.learning.book.ticket.dao;

import org.springframework.data.repository.CrudRepository;

import com.learning.book.ticket.entities.Ticket;

public interface TicketBookingDAO extends CrudRepository<Ticket, Integer> {

}
