package com.courses.spalah.persistence;

import com.courses.spalah.domain.Flight;
import com.courses.spalah.domain.Location;
import com.courses.spalah.domain.RawFlight;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;


/**
 * Created by Roman on 24.11.2016.
 */
@Transactional
public class FlightDao implements DaoForFlight<Flight, Long, RawFlight> {
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
    @Override
    public List<Flight> searchFlights(RawFlight searchedFlight) {
        /*CriteriaQuery<Flight> crit = entityManager.getCriteriaBuilder().createQuery(Flight.class);
        Root<Flight> flight = crit.from(Flight.class);
        crit = crit.select(flight).alias(
        crit..createCriteria("flight")
                .createAlias("flight.arrival_id", "arrival", Criteria.LEFT_JOIN)
                .createAlias("flight.departure_id", "departure", Criteria.LEFT_JOIN);
        if(long.class.isInstance(searchedFlight.getId()))
            crit.add(Expression.eq("id",searchedFlight.getId()));
        if(String.class.isInstance(searchedFlight.getFlightNumber()) && String.class.isInstance(searchedFlight.getFlightNumber()))
            crit.add(Expression.like("flight_number","upper(%"+searchedFlight.getFlightNumber().toUpperCase()+"%)"));
        if(Date.class.isInstance(searchedFlight.getArrivalDate()) && Date.class.isInstance(searchedFlight.getDepartureDate2()))
            crit.add(Expression.between("arrival_date",searchedFlight.getArrivalDate(),searchedFlight.getArrivalDate2()));
        if(Date.class.isInstance(searchedFlight.getDepartureDate()) && Date.class.isInstance(searchedFlight.getDepartureDate2()))
            crit.add(Expression.between("departure_date",searchedFlight.getDepartureDate(),searchedFlight.getDepartureDate2()));
        if(String.class.isInstance(searchedFlight.getArrival()))
            crit.add(Expression.like("arrival.city",searchedFlight.getArrival()));
        if(String.class.isInstance(searchedFlight.getDeparture()))
            crit.add(Expression.like("arrival.departure",searchedFlight.getDeparture()));
//flightNumber
        List<Flight> cats = crit.list();*/
        return null;
    }
}
