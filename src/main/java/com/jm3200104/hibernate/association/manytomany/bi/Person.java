package com.jm3200104.hibernate.association.manytomany.bi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3200104_MTM_BI_PERSON")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Address> addresses = new ArrayList<>();

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

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

	public void addAddress(Address address) {
		if (!Objects.nonNull(addresses)) {
			addresses = new ArrayList<>();
		}
		addresses.add(address);
		address.addPerson(this);
	}

}
