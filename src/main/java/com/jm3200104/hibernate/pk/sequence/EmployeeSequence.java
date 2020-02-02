package com.jm3200104.hibernate.pk.sequence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JM3200104_EMPLOYEE_SEQUENCE")
public class EmployeeSequence {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
	generator = "my_seq")
	@SequenceGenerator(name = "my_seq", 
	sequenceName = "JM3200104_EMPLOYEE_SEQ", 
	schema = "PUBLIC", 
	allocationSize = 1)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public long getId() {
		return id;
	}

	public EmployeeSequence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeSequence(String name, int age) {
		super();
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
