package com.test.TicketBooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusTicketController {




    @GetMapping("/busbookingg")
    public String createBooking(){

        double pnr = Math.random();

        return "bus booked successfully with PNR number :: "+pnr;
    }


}
