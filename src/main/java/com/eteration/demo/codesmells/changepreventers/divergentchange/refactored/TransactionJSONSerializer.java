package com.eteration.demo.codesmells.changepreventers.divergentchange.refactored;

public class TransactionJSONSerializer {
	
	
	public Transaction parse(String json) {
		return new Transaction();
	}
	
	public String parse(Transaction transaction) {
		return "{'id':"+transaction.getId()+",'txDate':"+transaction.getTxDate()+",'explanation':"+transaction.getExplanation()+"}";
	}

}
