package com.jm3200104.basicjava.association;

public class A {

	// association
	B b;

	// association - composition
	public A() {
		this.b = new B();
	}

	// association - aggregation
	public A(B b) {
		this.b = b;
	}
}
