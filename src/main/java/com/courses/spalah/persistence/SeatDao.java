package com.courses.spalah.persistence;

import com.courses.spalah.domain.Seat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Artem Uskov on 22.11.2016.
 */
public class SeatDao implements Dao<Seat, Long>{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Seat getById(Long id) {
        return entityManager.find(Seat.class, id);
    }

    @Override
    public Seat save(Seat seat) {
        entityManager.persist(seat);
        return seat;
    }

    @Override
    public List<Seat> getAll() {
        List<Seat> seats = entityManager.createQuery("from seat", Seat.class).getResultList();
        return seats;
    }

    @Override
    public Seat delete(Long id) {
        Seat deletedSeat = entityManager.find(Seat.class, id);
        entityManager.remove(deletedSeat);
        return deletedSeat;
    }

    @Override
    public Seat update(Seat seat) {
        return entityManager.merge(seat);
    }

    @Override
    public List<Seat> saveAll(List<Seat> seats) {
        entityManager.persist(seats);
        return null;
    }

}
