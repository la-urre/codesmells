package com.eteration.demo.codesmells.dispensables.speculativegenerality.smell;

public class CreditCardService {

	public void creditCardApplication(Account account) {

		if(account.getBalance().doubleValue() > 100000) {
			// premium customer, go with platinium creditcard
		} else  {
			// standard customer, go with green creditcard
			if (account.getBalance().doubleValue() <= 0) {
				// should not happen here because it was checked before
				// cannot satisfy request
				// throw an exception
			}
		}

	}

}
