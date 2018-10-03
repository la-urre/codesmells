package com.eteration.demo.codesmells.dispensables.duplicatecode.smell;

public class AutoPolicy extends Policy {

	public double getPremium() {
		double riskFee = 0;
		for (Risk r : getRisks())
			riskFee += r.getFee();

		double baseFee = 11.5;
		baseFee = baseFee * 1.18;

		return baseFee + riskFee + getCommission();
	}

}
