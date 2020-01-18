package com.jm3200104.spring.di.di05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		engine.start();
		System.out.println("Car is being driven");
	}

}
