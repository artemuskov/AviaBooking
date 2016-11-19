package com.courses.spalah.domain;

import javax.persistence.*;

/**
 * Created by Roman on 19.11.2016.
 */
@Entity(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "place_id", nullable = true)
    private Place place;
    @Column(name = "price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = true)
    private Flight flight;
    @Column(name = "state")
    private int state;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = true)
    private Person person;

    public Ticket() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

