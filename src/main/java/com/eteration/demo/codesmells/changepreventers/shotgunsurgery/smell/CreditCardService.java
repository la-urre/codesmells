package com.eteration.demo.codesmells.changepreventers.shotgunsurgery.smell;

public class CreditCardService {

	public void creditCardApplication(Account account) {

		if(account.getBalance().doubleValue() > 500) {
			// premium customer, go with platinium creditcard
		} else  {
			// standard customer, go with green creditcard
		}

	}

}
