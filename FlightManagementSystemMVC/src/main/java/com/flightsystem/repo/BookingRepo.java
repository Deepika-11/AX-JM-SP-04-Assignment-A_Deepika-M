package com.flightsystem.repo;

import org.springframework.data.repository.CrudRepository;

import com.flightsystem.model.Booking;


public interface BookingRepo extends CrudRepository<Booking, String>{

}
