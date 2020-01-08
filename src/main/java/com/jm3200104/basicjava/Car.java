package com.jm3200104.basicjava;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is running...");
	}
}
