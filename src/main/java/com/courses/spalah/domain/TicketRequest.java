package com.courses.spalah.domain;

/**
 * Created by Artem Uskov on 24.11.2016.
 */
public class TicketRequest {

    private Long id;
    private Long seat;
    private Double price;
    private Long flight;
    private Long person;
    private Long state;

    public TicketRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getSeat() {
        return seat;
    }

    public void setSeat(Long seat) {
        this.seat = seat;
    }

    public Long getFlight() {
        return flight;
    }

    public void setFlight(Long flight) {
        this.flight = flight;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long person) {
        this.person = person;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }
}
