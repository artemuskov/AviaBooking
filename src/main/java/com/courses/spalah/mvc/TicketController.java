package com.courses.spalah.mvc;

import com.courses.spalah.domain.Flight;
import com.courses.spalah.domain.Person;
import com.courses.spalah.domain.Ticket;
import com.courses.spalah.domain.TicketRequest;
import com.courses.spalah.service.FlightService;
import com.courses.spalah.service.PersonService;
import com.courses.spalah.service.SeatService;
import com.courses.spalah.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Artem Uskov on 24.11.2016.
 */

@RestController
@RequestMapping(value = "/ticket", produces = MediaType.APPLICATION_JSON_VALUE)
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlightService flightService;

    @Autowired
    private PersonService personService;

    @Autowired
    private SeatService seatService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Ticket> getTicket(@RequestParam long id) {
        Ticket idTicket = ticketService.getById(id);
        return new ResponseEntity<Ticket>(idTicket, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST/*, produces = MediaType.APPLICATION_JSON_VALUE*/)
    @ResponseBody
    public ResponseEntity<Ticket> saveTicket(@RequestParam Double price) {
        Ticket newTicket = new Ticket();
        newTicket.setPrice(price);
        return new ResponseEntity<Ticket>(newTicket, HttpStatus.OK);
    }

}
