package com.courses.spalah.service;

import com.courses.spalah.domain.Plane;

import java.util.List;

/**
 * Created by Artem Uskov on 19.11.2016.
 */
public interface PlaneService {

    Plane getById(Long id);

    Plane save(Plane plane);

    List<Plane> getAll();

    Long delete(Long id);
}
