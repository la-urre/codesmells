package com.eteration.demo.codesmells.changepreventers.divergentchange.smell;

public class TransactionJSONSerializer {
	
	
	public Transaction toTransactionObject(String json) {
		return new Transaction();
	}

}
