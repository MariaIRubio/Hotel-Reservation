package com.exercise.hotelreservation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Reservation {


    @NotNull(message = "Check-in Date required")
    private LocalDate checkInDate;

    @NotNull(message = "Check-out Date required")
    private LocalDate checkOutDate;


    private String roomType;

    @NotNull(message = "Smoking Preferences required")
    private String smokingPreferences;

    private String breakfast;

    private String lateCheckOut;

    @NotNull(message = "Agree to Terms is required")
    private String agreeTerms;

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    public void setSmokingPreferences(String smokingPreferences) {
        this.smokingPreferences = smokingPreferences;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLateCheckOut() {
        return lateCheckOut;
    }

    public void setLateCheckOut(String lateCheckOut) {
        this.lateCheckOut = lateCheckOut;
    }

    public String getAgreeTerms() {
        return agreeTerms;
    }

    public void setAgreeTerms(String agreeTerms) {
        this.agreeTerms = agreeTerms;
    }
}
