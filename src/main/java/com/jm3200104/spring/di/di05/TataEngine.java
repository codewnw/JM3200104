package com.jm3200104.spring.di.di05;

import org.springframework.stereotype.Component;

@Component
public class TataEngine implements Engine {

	public TataEngine() {
		System.out.println(this.getClass().getSimpleName()+ " is being manufactured");
	}

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
