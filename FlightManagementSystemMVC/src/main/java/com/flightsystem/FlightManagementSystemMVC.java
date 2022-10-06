package com.flightsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class FlightManagementSystemMVC {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemMVC.class, args);
	}

}
