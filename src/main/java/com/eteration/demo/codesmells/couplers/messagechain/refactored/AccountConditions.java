package com.eteration.demo.codesmells.couplers.messagechain.refactored;

public class AccountConditions {

	public static boolean isAuthorizedToCreateAccount(Customer customer) {
		return customer.isMajor() || customer.isLegallyEmancipated();
	}


}
