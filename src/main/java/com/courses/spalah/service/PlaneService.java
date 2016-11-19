package com.courses.spalah.service;


import com.courses.spalah.domain.Plane;
import com.courses.spalah.persistence.DaoAll;

import java.util.Collection;

/**
 * Created by Roman on 19.11.2016.
 */
public class PlaneService implements SimpleService<Plane, Long> {
    private final DaoAll<Plane, Long> planeDao;

    public PlaneService(DaoAll<Plane, Long> planeDao) {
        this.planeDao = planeDao;
    }

    @Override
    public Plane getById(Long id) {
        return planeDao.getById(id);
    }

    @Override
    public Plane save(Plane plane) {
        return planeDao.save(plane);
    }
    @Override
    public Collection<Plane> getAll() {
        return planeDao.getAll();
    }
}
