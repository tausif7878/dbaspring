package com.spring.jpa.dao;
import org.springframework.data.repository.CrudRepository;
import com.spring.jpa.model.Ticket;


public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
