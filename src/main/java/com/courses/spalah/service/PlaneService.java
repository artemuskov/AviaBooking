package com.courses.spalah.service;

import com.courses.spalah.domain.Plane;

/**
 * Created by Artem Uskov on 19.11.2016.
 */
public interface PlaneService {

    Plane getById(Long id);

    Plane save(Plane plane);
}
