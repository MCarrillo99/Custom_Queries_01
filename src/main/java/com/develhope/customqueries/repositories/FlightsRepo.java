package com.develhope.customqueries.repositories;

import com.develhope.customqueries.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepo extends JpaRepository<Flight, Long> {


}
