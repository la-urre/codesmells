package com.eteration.demo.codesmells.changepreventers.shotgunsurgery.refactored;

public class CreditCardService {

	public void creditCardApplication(Account account) {

		if (account.isPremiumCustomer()) {
			// premium customer, go with platinium creditcard
		} else {
			// standard customer, go with green creditcard
		}

	}

}
