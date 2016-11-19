package com.courses.spalah.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by artem on 17.11.2016.
 */
@Entity(name = "plane")
public class Plane {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "plane_name")
    private String planeName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plane")
    private Collection<Place> places = new ArrayList<Place>();

    public Plane() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public Collection<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Collection<Place> places) {
        this.places = places;
    }
}
