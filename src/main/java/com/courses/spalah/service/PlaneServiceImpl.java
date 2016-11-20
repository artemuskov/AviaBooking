package com.courses.spalah.service;

import com.courses.spalah.domain.Plane;
import com.courses.spalah.persistence.Dao;

/**
 * Created by Artem Uskov on 19.11.2016.
 */
public class PlaneServiceImpl implements PlaneService {
    private final Dao<Plane, Long> planeDao;

    public PlaneServiceImpl(Dao<Plane, Long> planeDao) {
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
}
