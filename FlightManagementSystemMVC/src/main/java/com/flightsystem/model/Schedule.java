package com.flightsystem.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String scheduleId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="srcAirport", referencedColumnName = "airportName")
	private Airport sourceAirport;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "destAirport", referencedColumnName = "airportName")
	private Airport destinationAirport;
	
	
	public Schedule() {
		
	}

	public Schedule(String scheduleId, Airport sourceAirport, Airport destinationAirport, Date scheduleDate) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Airport getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", scheduleDate=" + "scheduleDate" + "]";
	}
	
}
