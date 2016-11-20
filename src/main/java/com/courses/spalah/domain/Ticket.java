package com.courses.spalah.domain;

import javax.persistence.*;

/**
 * Created by Artem Uskov on 19.11.2016.
 */

@Entity(name = "ticket")
public class Ticket {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = true)
    private Seat seat;

    @Column(name = "price")
    private Long price;


    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = true)
    private Flight flight;

    @Column(name = "state")
    private Long state;

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

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
