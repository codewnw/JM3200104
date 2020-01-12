package com.jm3200104.spring.di.di04;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine is being manufactured.");
	}

	public void start() {
		System.out.println("Engine started");
	}

}
