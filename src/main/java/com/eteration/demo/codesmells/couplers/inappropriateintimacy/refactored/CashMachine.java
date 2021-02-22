package com.eteration.demo.codesmells.couplers.inappropriateintimacy.refactored;

import java.math.BigDecimal;

public class CashMachine {

	public void withdrawFrom(Account account, BigDecimal amount) {
		try {
			account.withdraw(amount);
		}
		catch (Exception e) {
			// not enough money on account, show message to user
		}
	}

}
