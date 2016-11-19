package com.courses.spalah.domain;

import javax.persistence.*;

/**
 * Created by artem on 17.11.2016.
 */
@Entity(name = "location")
public class Location {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @Column(name = "Latitude")
    private double Latitude;
    @Column(name = "Longitute")
    private double Longitute;

    public Location() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitute() {
        return Longitute;
    }

    public void setLongitute(double longitute) {
        Longitute = longitute;
    }
}
