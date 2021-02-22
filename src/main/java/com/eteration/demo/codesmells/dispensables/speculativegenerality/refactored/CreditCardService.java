package com.eteration.demo.codesmells.dispensables.speculativegenerality.refactored;

public class CreditCardService {

	public void creditCardApplication(Account account) {

		if(account.getBalance().doubleValue() > 100000) {
			// premium customer, go with platinium creditcard
		} else  {
			// standard customer, go with green creditcard
		}

	}

}
