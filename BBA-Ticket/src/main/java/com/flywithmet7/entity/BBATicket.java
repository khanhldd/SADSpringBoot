package com.flywithmet7.entity;

public class BBATicket {
	private String airLineFirm;
	private Integer fightId;
	private String classtk;
	private String from;
	private String to;
	private String date;
	private String seat;
	private String adult;
	private String children;
	private String baby;
	
	  public BBATicket (String airLineFirm, Integer fightId, String classtk, String from, String to, String date, String seat,String adult, String children, String baby ) 
	   {
		  this.airLineFirm = airLineFirm;
		  this.fightId = fightId;
		  this.classtk = classtk;
		  this.from = from;
		  this.to = to;
		  this.date = date;
		  this.seat = seat;
		  this.adult = adult;
		  this.children = children;
		  this.baby = baby;
	    }
	
	public String getAirLineFirm() {
		return airLineFirm;
	}
	public void setAirLineFirm(String airLineFirm) {
		this.airLineFirm = airLineFirm;
	}
	public Integer getFightId() {
		return fightId;
	}
	public void setFightId(Integer fightId) {
		this.fightId = fightId;
	}
	public String getClasstk() {
		return classtk;
	}
	public void setClasstk(String classtk) {
		this.classtk = classtk;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getAdult() {
		return adult;
	}
	public void setAdult(String adult) {
		this.adult = adult;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getBaby() {
		return baby;
	}

	public void setBaby(String baby) {
		this.baby = baby;
	}
	
	
}
