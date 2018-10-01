package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.smell;

public class EngineeringEmployee extends Employee {

	public EngineeringEmployee(String name, Responsibility responsibility) {
		super(name,responsibility);
		
	}

}
