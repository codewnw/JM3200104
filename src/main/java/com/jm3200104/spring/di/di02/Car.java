package com.jm3200104.spring.di.di02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	// dependency injection - setter injection
	@Autowired
	public void setEngine(Engine engine) {
		System.out.println("Putting engine into Car.");
		this.engine = engine;
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		engine.start();
		System.out.println("Driving the car...");
	}
}
