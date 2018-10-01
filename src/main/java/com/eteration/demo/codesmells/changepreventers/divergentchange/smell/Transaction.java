package com.eteration.demo.codesmells.changepreventers.divergentchange.smell;

import java.util.Date;

public class Transaction {
	
	private long id;
	private Date txDate;
	private String explanation;

	
	
	public String toJSON() {
		return "{'id':"+id+",'txDate':"+txDate+",'explanation':"+explanation+"}";
	}
	
}
