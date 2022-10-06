package com.flightsystem.repo;

import org.springframework.data.repository.CrudRepository;

import com.flightsystem.model.Flight;


public interface FlightRepo extends CrudRepository<Flight, String>{

}
