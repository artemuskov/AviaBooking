package com.courses.spalah.persistence;

import java.util.List;

/**
 * @author Ievgen Tararaka
 */
public interface Dao<E, I> {
    E getById(I id);

    E save(E entity);

    List<E> getAll();

    I delete(I id);
}
