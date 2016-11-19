package com.courses.spalah.service;

import com.courses.spalah.domain.Person;
import com.courses.spalah.persistence.DaoAll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ievgen Tararaka
 */
@Configuration
public class ServiceConfiguration {
    @Bean
    SimpleService personService(DaoAll<Person, Long> personDao) {
        return new PersonServiceImpl(personDao);
    }
}
