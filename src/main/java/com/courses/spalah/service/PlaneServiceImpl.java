package com.courses.spalah.service;

import com.courses.spalah.domain.Plane;
import com.courses.spalah.domain.Seat;
import com.courses.spalah.persistence.Dao;

import java.util.ArrayList;
import java.util.List;

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
        planeDao.save(plane);
        List<Seat> seats = new ArrayList<>();
        Seat seat = new Seat();
        seat.setNumber(1);
        seat.setPlane(plane);
        seats.add(seat);
        plane.setSeats(seats);
        return planeDao.update(plane);
     //   plane.setPlaneName("HA-HA!");
        //return plane;
    }

    @Override
    public List<Plane> getAll() {
        return planeDao.getAll();
    }

    @Override
    public Plane delete(Long id) {
        return planeDao.delete(id);
    }

    @Override
    public Plane update(Plane plane) {
        return planeDao.update(plane);
    }
}
