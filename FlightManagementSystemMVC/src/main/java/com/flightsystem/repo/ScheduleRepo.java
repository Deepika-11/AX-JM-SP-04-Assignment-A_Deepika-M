package com.flightsystem.repo;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.flightsystem.model.Schedule;

public interface ScheduleRepo extends CrudRepository<Schedule, String>{


	
}
