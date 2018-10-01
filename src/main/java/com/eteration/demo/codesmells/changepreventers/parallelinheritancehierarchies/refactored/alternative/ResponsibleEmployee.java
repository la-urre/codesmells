package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.refactored.alternative;

public abstract class ResponsibleEmployee {
	
	private long id;
	private String name;
	
	
	public abstract String getFullResponsiblityDefinition();
	
	public abstract int getSuccessRatio();
	
	
	public ResponsibleEmployee(String name) {
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
