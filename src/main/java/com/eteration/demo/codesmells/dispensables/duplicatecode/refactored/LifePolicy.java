package com.eteration.demo.codesmells.dispensables.duplicatecode.refactored;

public class LifePolicy extends Policy {

	@Override
	public double getPolicyBasedFee() {
		double calculatedBaseFee = getBaseFee();
		return  calculatedBaseFee + (calculatedBaseFee * getRisks().size() / 10);
	}

}
