package com.eteration.demo.codesmells.bloaters.primitiveobsession.refactored;

public class EFTRequest {
	
	private AccountNumber sourceAccountNumber;
	
	private AccountNumber targetAccountNumber;
	
	private DateRange validDateInterval;
	
	private Money transferAmount;

	public AccountNumber getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(AccountNumber sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	public AccountNumber getTargetAccountNumber() {
		return targetAccountNumber;
	}

	public void setTargetAccountNumber(AccountNumber targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}

	public DateRange getValidDateInterval() {
		return validDateInterval;
	}

	public void setValidDateInterval(DateRange validDateInterval) {
		this.validDateInterval = validDateInterval;
	}

	public Money getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Money transferAmount) {
		this.transferAmount = transferAmount;
	}
	
	

}
