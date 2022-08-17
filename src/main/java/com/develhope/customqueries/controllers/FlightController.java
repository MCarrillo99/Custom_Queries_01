package com.develhope.customqueries.controllers;

import com.develhope.customqueries.entities.Flight;
import com.develhope.customqueries.repositories.FlightsRepo;
import com.develhope.customqueries.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightsRepo flightsRepo;

    @PostMapping
    public void post50RandomFlights(){
        flightService.random50Create();
    }

    @GetMapping
    public List<Flight> getAllFlights(){
        return flightsRepo.findAll();
    }


}
