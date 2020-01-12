package com.jm3200104.spring.di.di03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car = (Car) context.getBean("car");
		car.drive();
	}

}
