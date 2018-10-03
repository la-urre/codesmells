package com.eteration.demo.codesmells.dispensables.duplicatecode.smell;

public class LifePolicy extends Policy {

	public double getPremium() {
		double riskFee = 0;
		for (Risk r : getRisks())
			riskFee += r.getFee();

		double baseFee = 18.5;
		baseFee = baseFee + (baseFee * getRisks().size() / 10);

		return baseFee + riskFee + getCommission();
	}

}
