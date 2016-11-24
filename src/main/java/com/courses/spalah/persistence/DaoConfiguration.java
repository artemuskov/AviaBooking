package com.courses.spalah.persistence;

import com.courses.spalah.domain.Location;
import com.courses.spalah.domain.Person;
import com.courses.spalah.domain.Plane;
import com.courses.spalah.domain.Seat;
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
}
