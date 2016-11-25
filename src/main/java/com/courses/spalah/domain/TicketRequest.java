package com.courses.spalah.domain;

/**
 * Created by Artem Uskov on 24.11.2016.
 */
public class TicketRequest {

    private long id;
    private Long seat;
    private Double price;
    private Long flight;
    private Long person;

    public TicketRequest() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
