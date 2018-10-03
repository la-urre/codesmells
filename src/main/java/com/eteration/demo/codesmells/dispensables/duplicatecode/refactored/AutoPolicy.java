package com.eteration.demo.codesmells.dispensables.duplicatecode.refactored;

public class AutoPolicy extends Policy {


	@Override
	public double getPolicyBasedFee() {
		return getBaseFee() * 1.18;
	}

}
