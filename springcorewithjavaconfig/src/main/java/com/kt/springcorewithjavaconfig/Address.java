package com.kt.springcorewithjavaconfig;

import org.springframework.stereotype.Component;


public class Address {

	int streetNum;
	String state;
	String colony;
	public int getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int streetNum, String state, String colony) {
		super();
		this.streetNum = streetNum;
		this.state = state;
		this.colony = colony;
	}
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", state=" + state + ", colony=" + colony + "]";
	}
	
	
	
}
