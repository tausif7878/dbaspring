package com.spring.jpa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.dao.TicketDao;
import com.spring.jpa.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketDao dao;
	
	@PostMapping("/bookTickets")
	public String bookTicket(List<Ticket> tickets) {
		dao.saveAll(tickets);
		return "ticket booked : " + tickets.size();
		
	}
	@GetMapping("/getTickets")
	public List<Ticket> gettickets(){
		return (List<Ticket>) dao.findAll();
	}

}
