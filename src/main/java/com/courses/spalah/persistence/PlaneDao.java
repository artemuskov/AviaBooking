package com.courses.spalah.persistence;

import com.courses.spalah.domain.Plane;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Artem Uskov on 19.11.2016.
 */

@Transactional
public class PlaneDao implements Dao<Plane, Long> {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Plane getById(Long id) {
        return entityManager.find(Plane.class, id);
    }

    @Override
    public Plane save(Plane entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public List<Plane> getAll() {
        List<Plane> planes = entityManager.createQuery("from plane", Plane.class).getResultList();
        return planes;
    }

    @Override
    public Long delete(Long id) {
        return id;
    }
}
