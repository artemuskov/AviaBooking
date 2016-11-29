package com.courses.spalah.mvc;

import com.courses.spalah.domain.Flight;
import com.courses.spalah.domain.RawFlight;
import com.courses.spalah.service.FlightService;
import com.courses.spalah.service.LocationService;
import com.courses.spalah.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Roman on 24.11.2016.
 */
@RestController
@RequestMapping(value = "/flight", produces = MediaType.APPLICATION_JSON_VALUE)
public class FlightController {
    @Autowired
    private FlightService flightService;

    @Autowired
    private PlaneService planeService;

    @Autowired
    private LocationService locationService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Flight> getFlight(@RequestParam Long id) {
        Flight flight = flightService.getById(id);
        return new ResponseEntity<Flight>(flight, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Flight> saveFlight(@RequestBody RawFlight flight) {
        //{"flightNumber":"Test","currentPlane":7,"departure":1,"arrival":2,"departureDate":"2016-11-24 12:36:00","arrivalDate":"2016-11-25 12:36:00"}
        Flight newFlight = flightService.save(flight);
        return new ResponseEntity<>(newFlight, HttpStatus.OK);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<List<Flight>> getAllFlight() {
        List<Flight> flights = flightService.getAll();
        return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseEntity<Flight> deleteFlight(@RequestParam Long id) {
        Flight deletedFlight = flightService.delete(id);
        return new ResponseEntity<Flight>(deletedFlight,HttpStatus.OK);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Flight> updateFlight(@RequestBody RawFlight flight) {
        Flight updatedFlight = flightService.update(flight);
        return new ResponseEntity<Flight>(updatedFlight, HttpStatus.OK);
    }
    @RequestMapping(value = "search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Flight>> searchFlights(@RequestBody RawFlight flight) {
        List<Flight> flights = flightService.searchFlights(flight);
        return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);
    }
}
