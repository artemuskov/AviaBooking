package com.courses.spalah.service;

import com.courses.spalah.domain.Person;
import com.courses.spalah.persistence.DaoAll;

import java.util.Collection;

/**
 * @author Ievgen Tararaka
 */
public class PersonServiceImpl implements SimpleService<Person, Long> {
    private final DaoAll<Person, Long> personDao;

    public PersonServiceImpl(DaoAll<Person, Long> personDao) {
        this.personDao = personDao;
    }

    @Override
    public Person getById(Long id) {
        return personDao.getById(id);
    }

    @Override
    public Person save(Person person) {
        return personDao.save(person);
    }

    @Override
    public Collection<Person> getAll() {
        return personDao.getAll();
    }
}
