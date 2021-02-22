package com.eteration.demo.codesmells.couplers.inappropriateintimacy.refactored;

import java.math.BigDecimal;

public class Account {
	
	private long id;
	
	BigDecimal balance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public void withdraw(BigDecimal amount) {
		if (balance.compareTo(amount) > 0) {
			balance = balance.subtract(amount);
		}
		else {
			// throw exception
		}
	}
}
