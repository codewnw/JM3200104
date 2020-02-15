package com.jm3200104.hibernate.association.onetomany.uni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3200104_OTM_UNI_COURSE")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COURSE_ID")
	private List<Assignment> assignments;

	public long getId() {
		return id;
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

	public Course(String name, List<Assignment> assignments) {
		super();
		this.name = name;
		this.assignments = assignments;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", assignments=" + assignments + "]";
	}

}
