package com.learning.book.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.book.ticket.entities.Ticket;

@Repository
public interface TicketBookingDAO extends CrudRepository<Ticket, Integer> {

}
