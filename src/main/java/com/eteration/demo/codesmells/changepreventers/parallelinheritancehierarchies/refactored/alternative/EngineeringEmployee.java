package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.refactored.alternative;

public class EngineeringEmployee extends ResponsibleEmployee {

	public EngineeringEmployee(String name) {
		super(name);
		
	}

	@Override
	public String getFullResponsiblityDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSuccessRatio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
