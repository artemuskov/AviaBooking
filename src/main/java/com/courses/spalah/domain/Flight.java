package com.courses.spalah.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by artem on 17.11.2016.
 */

@Entity(name = "flight")
public class Flight {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flight_number")
    private String flightNumber;

    @ManyToOne
    @JoinColumn(name = "plane_id", nullable = true)
    private Plane currentPlane;

    @ManyToOne
    @JoinColumn(name = "departure_id", nullable = true)
    private Location departure;

    @ManyToOne
    @JoinColumn(name = "arrival_id", nullable = true)
    private Location arrival;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Plane getCurrentPlane() {
        return currentPlane;
    }

    public void setCurrentPlane(Plane currentPlane) {
        this.currentPlane = currentPlane;
    }

    public Location getDeparture() {
        return departure;
    }

    public void setDeparture(Location departure) {
        this.departure = departure;
    }

    public Location getArrival() {
        return arrival;
    }

    public void setArrival(Location arrival) {
        this.arrival = arrival;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}