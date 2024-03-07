package com.exercise.hotelreservation.model;

import jakarta.validation.Valid;

public class Booking {

    @Valid
    private Guest guest = new Guest();
    @Valid
    private Reservation reservation = new Reservation();

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
