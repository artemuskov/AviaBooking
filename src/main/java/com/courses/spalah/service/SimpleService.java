package com.courses.spalah.service;

import com.courses.spalah.domain.Person;

import java.util.Collection;

/**
 * @author Ievgen Tararaka
 */
public interface SimpleService<E, I> {
    E getById(I id);

    E save(E person);

    Collection<E> getAll();
}
