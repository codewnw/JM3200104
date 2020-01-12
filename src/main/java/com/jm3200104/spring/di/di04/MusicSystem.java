package com.jm3200104.spring.di.di04;

import org.springframework.stereotype.Component;

@Component
public class MusicSystem {

	public MusicSystem() {
		System.out.println("Manufacturing musinc system.");
	}

	public void play() {
		System.out.println("Playing music");
	}
}
