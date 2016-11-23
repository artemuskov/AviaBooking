package com.courses.spalah.persistence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Ievgen Tararaka
 */
public interface Dao<E, I> {
    E getById(I id);

    E save(E entity);

    List<E> getAll();

    E delete(I id);

    E update(E entity);

    List<E> saveAll(List<E> entitys);
}
