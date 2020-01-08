package com.jm3200104.spring.ioc.ioc01;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		System.out.println("Car is being driven...");
	}

}
