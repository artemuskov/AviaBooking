package com.courses.spalah.persistence;

import com.courses.spalah.domain.Flight;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Roman on 24.11.2016.
 */
@Transactional
public class FlightDao implements Dao<Flight, Long> {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Flight getById(Long id) {
        return entityManager.find(Flight.class, id);
    }

    @Override
    public Flight save(Flight flight) {
        entityManager.persist(flight);
        return flight;
    }

    @Override
    public List<Flight> getAll() {
        List<Flight> flights = entityManager.createQuery("from flight", Flight.class).getResultList();
        return flights;
    }

    @Override
    public Flight delete(Long id) {
        Flight deletedFlight = entityManager.find(Flight.class, id);
        entityManager.remove(deletedFlight);
        return deletedFlight;
    }

    @Override
    public Flight update(Flight flight) {
        entityManager.merge(flight);
        return flight;
    }
}
