package com.jm3200104.spring.di.di07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;
	private MusicSystem musicSystem;

	@Autowired
	@Qualifier("voltasAirConditioner")
	private AirConditioner airConditioner;

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	@Autowired
	@Qualifier("sonyMusicSystem")
	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	// dependency inject - constructor injection
	@Autowired
	public Car(@Qualifier("tataEngine") Engine engine) {
		super();
		System.out.println("Car is being manufactured.");
		System.out.println("Putting engine into car");
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		musicSystem.play();
		airConditioner.on();
		System.out.println("Car is being driven...");
	}

}
