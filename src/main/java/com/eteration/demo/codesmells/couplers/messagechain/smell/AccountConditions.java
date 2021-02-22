package com.eteration.demo.codesmells.couplers.messagechain.smell;

public class AccountConditions {

	public static boolean isAuthorizedToCreateAccount(Customer customer) {
		return customer.getDetails().getAge() >= 18 || customer.getDetails().getLegalSituation().isEmancipated();
	}


}
