package com.flywithmet7.entity;

import java.util.List;

public class BBABooking {
    private Integer id;
    private List<Object> tickets;

    public BBABooking(Integer id, List<Object> tickets) {
        this.id = id;
        this.tickets = tickets;
    }

    public BBABooking() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getTickets() {
        return tickets;
    }

    public void setTickets(List<Object> tickets) {
        this.tickets = tickets;
    }
}
