package com.courses.spalah.persistence;

import com.courses.spalah.domain.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Artem Uskov on 24.11.2016.
 */
public class TicketDao implements Dao<Ticket, Long> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Ticket getById(Long id) {
        return entityManager.find(Ticket.class, id);
    }

    @Override
    public Ticket save(Ticket ticket) {
        entityManager.persist(ticket);
        return ticket;
    }

    @Override
    public List<Ticket> getAll() {
        List<Ticket> tickets = entityManager.createNamedQuery("from ticket", Ticket.class).getResultList();
        return tickets;
    }

    @Override
    public Ticket delete(Long id) {
        Ticket deletedTicket = entityManager.find(Ticket.class, id);
        entityManager.remove(deletedTicket);
        return deletedTicket;
    }

    @Override
    public Ticket update(Ticket ticket) {
        return entityManager.merge(ticket);
    }
}
