package com.courses.spalah.persistence;

import java.util.Collection;

/**
 * Created by Roman on 19.11.2016.
 */
public interface DaoAll<E, I> extends Dao<E,I> {
    Collection<E> getAll();
}
