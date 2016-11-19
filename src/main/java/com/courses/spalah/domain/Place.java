package com.courses.spalah.domain;

import javax.persistence.*;

/**
 * Created by artem on 17.11.2016.
 */
@Entity(name = "place")
public class Place {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "place_number")
    private int placeNumber;
    @Column(name = "is_business")
    private int isBusiness;
    @Column(name = "plane_id")
    private long plane;

    public Place() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public int getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(int isBusiness) {
        this.isBusiness = isBusiness;
    }

    public long getPlane() {
        return plane;
    }

    public void setPlane(long plane) {
        this.plane = plane;
    }
}
