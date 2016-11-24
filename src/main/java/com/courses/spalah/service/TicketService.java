package com.courses.spalah.service;

import com.courses.spalah.domain.Ticket;

import java.util.List;

/**
 * Created by Artem Uskov on 24.11.2016.
 */

public interface TicketService {

    Ticket getById(Long id);

    Ticket save(Ticket ticket);

    List<Ticket> getAll();

    Ticket delete(Long id);

    Ticket update(Ticket ticket);
}
