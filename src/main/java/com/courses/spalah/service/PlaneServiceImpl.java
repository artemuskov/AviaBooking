package com.courses.spalah.service;

import com.courses.spalah.domain.Plane;
import com.courses.spalah.domain.Seat;
import com.courses.spalah.persistence.Dao;
import com.courses.spalah.persistence.PlaneDao;
import com.courses.spalah.persistence.SeatDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Artem Uskov on 19.11.2016.
 */
public class PlaneServiceImpl implements PlaneService {
    private final Dao<Plane, Long> planeDao;
    //private final Dao<Seat, Long> seatDao;
    private final Dao<Seat, Long> seatDao;

    public PlaneServiceImpl(Dao<Plane, Long> planeDao, Dao<Seat, Long> seatDao) {
        this.planeDao = planeDao;
        this.seatDao = seatDao;
    }

    @Override
    public Plane getById(Long id) {
        return planeDao.getById(id);
    }

    @Override
    public Plane save(Plane plane, Long business, Long total) {
        planeDao.save(plane);
        List<Seat> seats = new ArrayList<>();
        for(int i = 1; i <= total; i++){
            Seat seat = new Seat();
            seat.setPlane(plane);
            seat.setNumber(i);
            if(i <= business) {
                seat.setBusiness(true);
            }
            seats.add(seat);
        }
        seatDao.saveAll(seats);
        return plane;
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
