package com.courses.spalah.domain;

/**
 * Created by Roman on 24.11.2016.
 */
public class RawFlight {
    private long id;
    private String flightNumber;
    private Long currentPlane;
    private Long departure;
    private Long arrival;
    private String departureDate;
    private String arrivalDate;

    public RawFlight() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getCurrentPlane() {
        return currentPlane;
    }

    public void setCurrentPlane(Long currentPlane) {
        this.currentPlane = currentPlane;
    }

    public Long getDeparture() {
        return departure;
    }

    public void setDeparture(Long departure) {
        this.departure = departure;
    }

    public Long getArrival() {
        return arrival;
    }

    public void setArrival(Long arrival) {
        this.arrival = arrival;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
