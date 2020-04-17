package com.example.demo.model;


public class Rate {

	private String rate;
	private String laneCount;
	private String tollStart;
	private String connstring;
	
	public Rate(String rate, String laneCount, String tollStart, String connstring) {
		this.setRate(rate);
		this.setlaneCount(laneCount);
		this.setTollStart(tollStart);
		this.setConnstring(connstring);
	}
	
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getlaneCount() {
		return laneCount;
	}
	public void setlaneCount(String laneCount) {
		this.laneCount = laneCount;
	}
	public String getTollStart() {
		return tollStart;
	}
	public void setTollStart(String tollStart) {
		this.tollStart = tollStart;
	}

	public String getConnstring() {
		return connstring;
	}

	public void setConnstring(String connstring) {
		this.connstring = connstring;
	}
}
