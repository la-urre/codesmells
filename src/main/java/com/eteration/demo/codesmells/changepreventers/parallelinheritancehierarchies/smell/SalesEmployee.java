package com.eteration.demo.codesmells.changepreventers.parallelinheritancehierarchies.smell;

import java.math.BigDecimal;

public class SalesEmployee extends Employee {
	
	private BigDecimal monthlyTarget;

	public SalesEmployee(String name, Responsibility responsibility) {
		super(name, responsibility);
	}

	public BigDecimal getMonthlyTarget() {
		return monthlyTarget;
	}

	public void setMonthlyTarget(BigDecimal monthlyTarget) {
		this.monthlyTarget = monthlyTarget;
	}

}
