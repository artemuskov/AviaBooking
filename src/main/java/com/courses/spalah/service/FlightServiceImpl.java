package com.courses.spalah.service;

import com.courses.spalah.domain.Flight;
import com.courses.spalah.domain.RawFlight;
import com.courses.spalah.persistence.DaoForFlight;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Roman on 24.11.2016.
 */

public class FlightServiceImpl implements FlightService {
    private final DaoForFlight<Flight, Long, RawFlight> flightDao;

    @Autowired
    private LocationService locationService;

    @Autowired
    private PlaneService planeService;

    public FlightServiceImpl(DaoForFlight<Flight, Long, RawFlight> flightDao) {
        this.flightDao = flightDao;
    }

    @Override
    public Flight getById(Long id) {
        return flightDao.getById(id);
    }

    @Override
    public Flight save(RawFlight flight) {
        Flight newFlight = new Flight();
        newFlight.setFlightNumber(flight.getFlightNumber());
        newFlight.setArrival(locationService.getById(flight.getArrival()));
        newFlight.setDeparture(locationService.getById(flight.getDeparture()));
        newFlight.setCurrentPlane(planeService.getById(flight.getCurrentPlane()));
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date arrivalDate = new Date();
        Date departureDate = new Date();
        try {
            arrivalDate = (Date)formatter.parseObject(flight.getArrivalDate());
            departureDate = (Date)formatter.parseObject(flight.getDepartureDate());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        newFlight.setArrivalDate(arrivalDate);
        newFlight.setDepartureDate(departureDate);
        newFlight.setPriceBusiness(flight.getPriceBusiness());
        newFlight.setPriceCasual(flight.getPriceCasual());
        flightDao.save(newFlight);
        return newFlight;
    }

    @Override
    public List<Flight> getAll() {
        return flightDao.getAll();
    }

    @Override
    public Flight delete(Long id) {
        return flightDao.delete(id);
    }

    @Override
    public Flight update(RawFlight flight) {
        Flight updatedFlight = flightDao.getById(flight.getId());
        updatedFlight.setFlightNumber(flight.getFlightNumber());
        updatedFlight.setArrival(locationService.getById(flight.getArrival()));
        updatedFlight.setDeparture(locationService.getById(flight.getDeparture()));
        updatedFlight.setCurrentPlane(planeService.getById(flight.getCurrentPlane()));
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date arrivalDate = new Date();
        Date departureDate = new Date();
        try {
            arrivalDate = (Date)formatter.parseObject(flight.getArrivalDate());
            departureDate = (Date)formatter.parseObject(flight.getDepartureDate());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        updatedFlight.setArrivalDate(arrivalDate);
        updatedFlight.setDepartureDate(departureDate);
        updatedFlight.setPriceBusiness(flight.getPriceBusiness());
        updatedFlight.setPriceCasual(flight.getPriceCasual());
        return flightDao.update(updatedFlight);
    }


    public List<Flight> searchFlights(RawFlight searchedFlight) {
        return flightDao.searchFlights(searchedFlight);
    }


}