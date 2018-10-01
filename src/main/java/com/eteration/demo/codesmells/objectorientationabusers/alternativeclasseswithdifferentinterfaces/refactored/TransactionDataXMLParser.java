package com.eteration.demo.codesmells.objectorientationabusers.alternativeclasseswithdifferentinterfaces.refactored;

import java.util.ArrayList;
import java.util.List;

public class TransactionDataXMLParser implements TransactionParser{

	public List<TransactionItem> parseTransacionData(){
		// file IO and parse xml txt then convert it to list
		
		return new ArrayList<>();
	}
	
	public void saveTranactions(List<TransactionItem> transactionRecords) {
		
		// JAVA object to xml and save to a file
		
	}

}
