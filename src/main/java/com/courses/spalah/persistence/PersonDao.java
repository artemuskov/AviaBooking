package com.courses.spalah.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.courses.spalah.domain.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Ievgen Tararaka
 */
@Transactional
public class PersonDao implements Dao<Person, Long> {
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
    public List<Person> getAll() {
        List<Person> planes = manager.createQuery("from Plane", Person.class).getResultList();
        return null;
    }

    @Override
    public Long delete(Long id) {
        return id;
    }
}
