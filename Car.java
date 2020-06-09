package com.parking.model;

public class Car{
	private String regNo;
	private String colour;
	private String hour;
	
	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public Car(String r, String c){
		this.regNo = r;
		this.colour = c;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getColour() {
		return colour;
	}
}