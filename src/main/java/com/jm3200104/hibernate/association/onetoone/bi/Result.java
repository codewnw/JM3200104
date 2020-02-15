package com.jm3200104.hibernate.association.onetoone.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3200104_ONETOONE_BI_RESULT")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	

	@Override
	public String toString() {
		return "Result [id=" + id + ", status=" + status + "]";
	}

	@Column(name = "status")
	private String status;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "result")
	private Trainee trainee;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(String status) {
		super();
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
