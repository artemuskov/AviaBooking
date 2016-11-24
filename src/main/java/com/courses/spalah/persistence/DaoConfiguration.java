package com.courses.spalah.persistence;

import com.courses.spalah.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ievgen Tararaka
 */
@Configuration
public class DaoConfiguration {
    @Bean
    public Dao<Person, Long> personDao() {
        return new PersonDao();
    }

    @Bean
    public Dao<Plane, Long> planeDao() {
        return new PlaneDao();
    }

    @Bean
    public Dao<Seat, Long> seatDao() {
        return new SeatDao();
    }

    @Bean
    public Dao<Location, Long> locationDao() {
        return new LocationDao();
    }

    @Bean
    public Dao<Ticket, Long> ticketDao() {
        return new TicketDao();
    }

    @Bean
    public DaoForFlight<Flight, Long, RawFlight> flightDao() {
        return new FlightDao();
    }
}
