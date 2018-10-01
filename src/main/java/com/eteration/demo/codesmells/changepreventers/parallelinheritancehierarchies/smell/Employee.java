package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.smell;

public class Employee {
	
	private long id;
	private String name;
	private Responsibility responsibility;
	
	
	
	
	
	public Employee(String name, Responsibility responsibility) {
		super();
		this.name = name;
		this.responsibility = responsibility;
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
	public Responsibility getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(Responsibility responsibility) {
		this.responsibility = responsibility;
	}
	

}
