package com.jm3200104.hibernate.association.onetomany.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3200104_OTM_BI_ASSIGNMENT")
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;
	
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "COURSE_ID")
	private Course course;

	public Assignment() {
		super();
	}

	@Override
	public String toString() {
		return "Assignement [id=" + id + ", name=" + name + "]";
	}

	public Assignment(String name) {
		super();
		this.name = name;
	}
	
	
}
