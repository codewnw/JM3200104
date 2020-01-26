package com.jm3200104.hibernate.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3200104_EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public long getId() {
		return id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
