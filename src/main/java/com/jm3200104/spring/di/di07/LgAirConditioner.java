package com.jm3200104.spring.di.di07;

import org.springframework.stereotype.Component;

@Component
public class LgAirConditioner implements AirConditioner {

	public LgAirConditioner() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void on() {
		System.out.println(this.getClass().getSimpleName() + " is on.");
	}

}
