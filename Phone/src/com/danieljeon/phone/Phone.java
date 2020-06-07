package com.danieljeon.phone;

public abstract class Phone {
	// method variables
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	// constructor
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.setVersionNumber(versionNumber);
		this.setBatteryPercentage(batteryPercentage);
		this.setCarrier(carrier);
		this.setRingTone(ringTone);
	}
	
	// abstract method to be implemented by the subclasses
	public abstract void displayInfo();

	// getters and setters
	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
}
