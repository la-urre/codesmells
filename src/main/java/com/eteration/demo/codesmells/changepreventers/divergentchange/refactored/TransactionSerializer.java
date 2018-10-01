package com.eteration.demo.codesmells.changepreventers.divergentchange.refactored;

public interface TransactionSerializer {

	Transaction parse(String json);

	String parse(Transaction transaction);

}