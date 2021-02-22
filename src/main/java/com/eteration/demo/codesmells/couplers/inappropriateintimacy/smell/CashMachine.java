package com.eteration.demo.codesmells.couplers.inappropriateintimacy.smell;

import java.math.BigDecimal;

public class CashMachine {

	public void withdrawFrom(Account account, BigDecimal amount) {
		// no checks made
		// we access the internals of Account
		account.balance = account.balance.subtract(amount);
	}

}
