package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.refactored;

import java.math.BigDecimal;

public class SalesEmployee extends Employee implements Responsibility {
	
	private BigDecimal monthlyTarget;

	public SalesEmployee(String name) {
		super(name);
	}

	public BigDecimal getMonthlyTarget() {
		return monthlyTarget;
	}

	public void setMonthlyTarget(BigDecimal monthlyTarget) {
		this.monthlyTarget = monthlyTarget;
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
