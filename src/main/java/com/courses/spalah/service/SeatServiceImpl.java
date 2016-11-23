package com.courses.spalah.service;

import com.courses.spalah.domain.Seat;
import com.courses.spalah.persistence.Dao;

import java.util.Collection;
import java.util.List;

/**
 * Created by Artem Uskov on 22.11.2016.
 */
public class SeatServiceImpl implements SeatService {

    private final Dao<Seat, Long> seatDao;

    public SeatServiceImpl(Dao<Seat, Long> daoSaveAll) {
        this.seatDao = daoSaveAll;
    }


    @Override
    public Seat getById(Long id) {
        return seatDao.getById(id);
    }

    @Override
    public Seat save(Seat seat) {
        return seatDao.save(seat);
    }

    @Override
    public List<Seat> getAll() {
        return seatDao.getAll();
    }

    @Override
    public Seat delete(Long id) {
        return seatDao.delete(id);
    }

    @Override
    public Seat update(Seat seat) {
        return seatDao.update(seat);
    }

}
