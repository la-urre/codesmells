package com.eteration.demo.codesmells.dispensables.deadcode.smell;

public class CreditCardService {

	public void creditCardApplication(Account account) {

		if(account.getBalance().doubleValue() > 500) {
			// premium customer, go with platinium creditcard
		} else  {
			// standard customer, go with green creditcard
		}

	}

	// never used
	private void checkBalance(Account account) {
		if (account.getBalance().intValue() < 0) {
			throw new IllegalStateException("Negative balance");
		}
	}

}
