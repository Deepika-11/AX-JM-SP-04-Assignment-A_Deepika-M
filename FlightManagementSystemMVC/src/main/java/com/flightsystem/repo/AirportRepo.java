package com.flightsystem.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightsystem.model.Airport;

@Repository
public interface AirportRepo extends CrudRepository<Airport, String>{


}
