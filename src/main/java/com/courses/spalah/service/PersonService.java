package com.courses.spalah.service;

import com.courses.spalah.domain.Person;

import java.util.List;

/**
 * @author Ievgen Tararaka
 */
public interface PersonService {
    Person getById(long id);

    Person save(Person person);

    List<Person> getAll();

    Person delete(long id);
}
