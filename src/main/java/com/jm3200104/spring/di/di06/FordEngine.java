package com.jm3200104.spring.di.di06;

import org.springframework.stereotype.Component;

@Component
public class FordEngine implements Engine {

	public FordEngine() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured");
	}

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
