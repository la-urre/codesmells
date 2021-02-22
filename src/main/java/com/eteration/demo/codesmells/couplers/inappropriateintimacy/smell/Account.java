package com.eteration.demo.codesmells.couplers.inappropriateintimacy.smell;

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
	
	

}
