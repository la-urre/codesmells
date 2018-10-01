package com.eteration.demo.codesmells.objectorientationabusers.refusedbequest.refactored;

import java.util.Date;

public class Employee {

	private long id;
	private String name;
	private Date birthDate;

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
