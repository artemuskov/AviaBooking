package com.courses.spalah.service;

import com.courses.spalah.domain.Ticket;
import com.courses.spalah.domain.TicketRequest;
import com.courses.spalah.persistence.Dao;
import com.courses.spalah.persistence.DaoForTicket;

import java.util.List;

/**
 * Created by Artem Uskov on 24.11.2016.
 */
public class TicketServiceImpl implements TicketService{
    private final DaoForTicket<Ticket, Long, TicketRequest> ticketDao;


    public TicketServiceImpl(DaoForTicket<Ticket, Long, TicketRequest> ticketDao) {
        this.ticketDao = ticketDao;
    }

    @Override
    public Ticket getById(Long id) {
        return ticketDao.getById(id);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketDao.save(ticket);
    }

    @Override
    public List<Ticket> getAll(Long flight) {
        return ticketDao.getAll(flight);
    }

    @Override
    public Ticket delete(Long id) {
        return ticketDao.delete(id);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return ticketDao.update(ticket);
    }

    @Override
    public Boolean checkTicket(TicketRequest ticket) {
        return ticketDao.checkTicket(ticket);
    }
}
