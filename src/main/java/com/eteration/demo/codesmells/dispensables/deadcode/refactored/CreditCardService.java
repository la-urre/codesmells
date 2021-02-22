package com.eteration.demo.codesmells.dispensables.deadcode.refactored;

public class CreditCardService {

	public void creditCardApplication(Account account) {

		if(account.getBalance().doubleValue() > 500) {
			// premium customer, go with platinium creditcard
		} else  {
			// standard customer, go with green creditcard
		}

	}

}
