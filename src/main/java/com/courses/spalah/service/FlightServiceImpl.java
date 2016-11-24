package com.courses.spalah.service;

import com.courses.spalah.domain.Flight;
import com.courses.spalah.persistence.Dao;

import java.util.List;

/**
 * Created by Roman on 24.11.2016.
 */

public class FlightServiceImpl implements FlightService {
    private final Dao<Flight, Long> flightDao;

    public FlightServiceImpl(Dao<Flight, Long> flightDao) {
        this.flightDao = flightDao;
    }

    @Override
    public Flight getById(Long id) {
        return flightDao.getById(id);
    }

    @Override
    public Flight save(Flight flight) {
        flightDao.save(flight);
        return flight;
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
    public Flight update(Flight flight) {
        return flightDao.update(flight);
    }
}