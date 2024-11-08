package com.SCore.CI;

public class Address {
	String area;
	int pin;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String area, int pin) {
		super();
		this.area = area;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", pin=" + pin + "]";
	}
	
	

}
