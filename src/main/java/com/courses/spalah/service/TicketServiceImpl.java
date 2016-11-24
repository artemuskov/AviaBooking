package com.courses.spalah.service;

import com.courses.spalah.domain.Ticket;
import com.courses.spalah.domain.TicketRequest;
import com.courses.spalah.persistence.Dao;

import java.util.List;

/**
 * Created by Artem Uskov on 24.11.2016.
 */
public class TicketServiceImpl implements TicketService{
    private final Dao<Ticket, Long> ticketDao;

    public TicketServiceImpl(Dao<Ticket, Long> ticketDao) {
        this.ticketDao = ticketDao;
    }

    @Override
    public Ticket getById(Long id) {
        return ticketDao.getById(id);
    }

    @Override
    public Ticket save(TicketRequest ticketRequest) {
        Ticket newTicket = new Ticket();
        newTicket.setFlight(ticketRequest.getFlight());
        newTicket.setPerson(ticketRequest.getPerson());
        newTicket.setSeat(ticketRequest.getSeat());
        newTicket.setPrice(ticketRequest.getPrice());
        newTicket.setState(0L);
        return ticketDao.save(newTicket);
    }

    @Override
    public List<Ticket> getAll() {
        return ticketDao.getAll();
    }

    @Override
    public Ticket delete(Long id) {
        return ticketDao.delete(id);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return ticketDao.update(ticket);
    }
}
