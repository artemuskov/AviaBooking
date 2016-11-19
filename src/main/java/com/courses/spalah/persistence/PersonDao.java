package com.courses.spalah.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.courses.spalah.domain.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * @author Ievgen Tararaka
 */
@Transactional
public class PersonDao implements DaoAll<Person, Long> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Person getById(Long id) {
        return manager.find(Person.class, id);
    }

    @Override
    public Person save(Person entity) {
        manager.persist(entity);
        return entity;
    }

    @Override
    public Collection<Person> getAll() {
        Collection<Person> persons = manager.createQuery("from person", Person.class).getResultList();
        return persons;
    }
}
