package com.jm3200104.hibernate.pk.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "JM3200104_EMPLOYEE_TABLE")
public class EmployeeTable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.TABLE, 
	generator = "my_seq")
	@TableGenerator(name = "my_seq", 
	table="JM3200104_EMPLOYEE_TABLE_FOR_SEQS",
	pkColumnName="SEQ_NAME",
	pkColumnValue="JM3200104_EMPLOYEE_TBL_SEQ",
			valueColumnName = "NEXT_VAL",
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

	public EmployeeTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeTable(String name, int age) {
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
