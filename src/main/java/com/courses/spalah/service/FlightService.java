package com.courses.spalah.service;

import com.courses.spalah.domain.Flight;
import com.courses.spalah.domain.RawFlight;

import java.util.List;

/**
 * Created by Roman on 24.11.2016.
 */

public interface FlightService {

    Flight getById(Long id);

    Flight save(RawFlight flight);

    List<Flight> getAll();

    Flight delete(Long id);

    Flight update(RawFlight flight);

    List<Flight> searchFlights(RawFlight searchedFlight);
}