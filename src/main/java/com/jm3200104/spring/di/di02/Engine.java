package com.jm3200104.spring.di.di02;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		super();
		System.out.println("Engine is being manufactured.");
	}

	public void start() {
		System.out.println("Engine started.");
	}

}
