package com.courses.spalah.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.courses.spalah.domain.Person;

/**
 * @author Ievgen Tararaka
 */
public class PersonDao implements Dao<Person, Long> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Person getById(Long id) {
        return manager.find(Person.class, id);
    }
}
