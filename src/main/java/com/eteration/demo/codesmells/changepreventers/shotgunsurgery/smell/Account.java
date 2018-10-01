package com.eteration.demo.codesmells.changepreventers.shotgunsurgery.smell;

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
	
	

}
