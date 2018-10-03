package com.eteration.demo.codesmells.dispensables.duplicatecode.smell;

import java.util.ArrayList;
import java.util.List;

public abstract class Policy implements Cloneable {
	

	private List<Risk> risks = new ArrayList<>();
	private double commission;


	public List<Risk> getRisks() {
		return risks;
	}

	public void addRisk(Risk risk) {
		this.getRisks().add(risk);
	}


	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Policy clone = (Policy) super.clone();
		clone.risks = new ArrayList<Risk>();
		for (Risk risk : risks)
			clone.risks.add(risk);
		return clone;
	}


}
