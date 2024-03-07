package com.exercise.hotelreservation.model;

import jakarta.validation.constraints.*;

public class Guest {

    @NotNull (message = "Name is required")
    @Size(min = 1, message = "name required")
    private String name = " ";

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email address")
    @Size(min = 1, message = "email required")
    private String email = " ";

    @NotNull(message = "Phone Number is required")
    @Size(min = 9, message = "Phone must have min 9 digits")
    private String phoneNumber = " ";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
