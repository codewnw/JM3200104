package com.jm3200104.spring.di.di04;

import org.springframework.stereotype.Component;

@Component
public class AirConditioner {

	public AirConditioner() {
		System.out.println("AC is being manufatured");
	}

	public void on() {
		System.out.println("AC is on now.");
	}
}
