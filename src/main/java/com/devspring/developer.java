package com.devspring;

public class developer {

	private String devName;
	private laptop lap;

	

	public laptop getLap() {
		return lap;
	}



	public void setLap(laptop lap) {
		this.lap = lap;
	}



	public developer(String devName) {
		super();
		this.devName = devName;
	}



	public String getDevName() {
		return devName;
	}



	public void setDevName(String devName) {
		this.devName = devName;
	}

	public void coding() {
		System.out.println("Hello... I Can Code !.....");
		lap.deploy();
	}
	
}
