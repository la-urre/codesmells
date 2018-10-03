package com.eteration.demo.codesmells.dispensables.duplicatecode.refactored;

import java.util.ArrayList;
import java.util.List;

import com.eteration.demo.codesmells.dispensables.duplicatecode.smell.Risk;

public abstract class Policy implements Cloneable {

	private double baseFee;
	private List<Risk> risks = new ArrayList<>();
	private double commission;

	public List<Risk> getRisks() {
		return risks;
	}

	public void addRisk(Risk risk) {
		this.getRisks().add(risk);
	}

	public double getPremium() {
		double riskFee = 0;
		for (Risk r : getRisks())
			riskFee += r.getFee();

		return getPolicyBasedFee() + riskFee + getCommission();
	}

	public abstract double getPolicyBasedFee();

	public double getBaseFee() {
		return baseFee;
	}

	public void setBaseFee(double baseFee) {
		this.baseFee = baseFee;
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
