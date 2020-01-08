package com.jm3200104.spring.ioc.ioc02;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		System.out.println("Car is being driven...");
	}

}
