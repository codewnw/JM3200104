package com.jm3200104.hibernate.association.onetomany.bi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
@Table(name = "JM3200104_OTM_BI_COURSE")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
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

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", assignments=" + assignments + "]";
	}

	/**
	 * This is handshaking method or util method to do the bi-directional mapping.
	 */
	public void addAssignment(Assignment assignment) {
		if (!Objects.nonNull(assignments)) {
			assignments = new ArrayList<Assignment>();
		}
		assignments.add(assignment);
		assignment.setCourse(this);
	}

}
