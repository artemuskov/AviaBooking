package com.courses.spalah.persistence;

import com.courses.spalah.domain.Plane;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * Created by Roman on 19.11.2016.
 */
@Transactional
public class PlaneDao implements Dao<Plane,Long>, DaoAll<Plane, Long> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Plane getById(Long id) {
        return null;
    }

    @Override
    public Plane save(Plane entity) {
        return null;
    }

    @Override
    public Collection<Plane> getAll() {
        manager.getTransaction().begin();
        Collection<Plane> persons = manager.createQuery("from plane", Plane.class).getResultList();
        manager.getTransaction().commit();
        manager.close();
        return persons;
    }
}
