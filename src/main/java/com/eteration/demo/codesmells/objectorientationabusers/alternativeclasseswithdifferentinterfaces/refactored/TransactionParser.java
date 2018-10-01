package com.eteration.demo.codesmells.objectorientationabusers.alternativeclasseswithdifferentinterfaces.refactored;

import java.util.List;

public interface TransactionParser {
	public List<TransactionItem> parseTransacionData();

	public void saveTranactions(List<TransactionItem> transactionRecords);
}
