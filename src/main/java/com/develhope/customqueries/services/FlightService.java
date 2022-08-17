package com.develhope.customqueries.services;

import com.develhope.customqueries.entities.Flight;
import com.develhope.customqueries.repositories.FlightsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class FlightService {

    @Autowired
    private FlightsRepo flightRepo;

    public void random50Create(){
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight(generateString(), generateString(), generateString());
            List<Flight> flights = new ArrayList<>();
            flights.add(flight);
            flightRepo.saveAllAndFlush(flights);
        }
    }

    private String generateString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}
