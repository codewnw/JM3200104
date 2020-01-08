package com.jm3200104.basicjava;

public class Driver {

	public static void main(String[] args) {
		Engine engine = new Engine();
		Car car = new Car(engine);
		car.drive();
	}

}
