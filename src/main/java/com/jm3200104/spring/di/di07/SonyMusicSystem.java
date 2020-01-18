package com.jm3200104.spring.di.di07;

import org.springframework.stereotype.Component;

@Component
public class SonyMusicSystem implements MusicSystem {

	public SonyMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void play() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
