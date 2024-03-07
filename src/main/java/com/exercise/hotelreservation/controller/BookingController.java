package com.exercise.hotelreservation.controller;

import com.exercise.hotelreservation.model.Booking;
import com.exercise.hotelreservation.model.Guest;
import com.exercise.hotelreservation.model.Reservation;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, trimmer);
    }

    @GetMapping("/reservation")
    public String makeReservation(Model model){
        model.addAttribute("booking", new Booking());
        return "reservation-form";
    }

    @PostMapping("/processForm")
    public String process(@Valid @ModelAttribute("booking") Booking booking, BindingResult binder){
        if(binder.hasErrors()){
            return "reservation-form";
        }else{
            return "confirmation";
        }
    }
}
