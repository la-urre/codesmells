package com.eteration.demo.codesmells.changepreventers.shotgunsurgery.refactored;

import java.math.BigDecimal;

public class Account {
	
	private long id;
	
	private BigDecimal balance;

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
	
	public boolean isPremiumCustomer() {
		return (balance.doubleValue()>500); // more logics can be added later without effect
	}
}
