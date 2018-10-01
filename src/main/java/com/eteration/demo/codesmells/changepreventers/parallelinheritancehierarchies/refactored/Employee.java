package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.refactored;

public class Employee {
	
	private long id;
	private String name;
	
	
	
	
	
	public Employee(String name) {
		super();
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

	

}
