package com.courses.spalah.persistence;

import com.courses.spalah.domain.Plane;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
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
    public Plane save(Plane plane) {
        entityManager.persist(plane);
        return plane;
    }

    @Override
    public List<Plane> getAll() {
        List<Plane> planes = entityManager.createQuery("from plane", Plane.class).getResultList();
        return planes;
    }

    @Override
    public Plane delete(Long id) {
        Plane deletedPlane = entityManager.find(Plane.class, id);
        entityManager.remove(deletedPlane);
        return deletedPlane;
    }

    @Override
    public Plane update(Plane plane) {
        entityManager.merge(plane);
        return plane;
    }

    @Override
    public List<Plane> saveAll(List<Plane> entitys) {
        return null;
    }
}
