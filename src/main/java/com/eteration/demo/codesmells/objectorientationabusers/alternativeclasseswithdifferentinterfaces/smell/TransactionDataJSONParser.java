package com.eteration.demo.codesmells.objectorientationabusers.alternativeclasseswithdifferentinterfaces.smell;

import java.util.ArrayList;
import java.util.List;

public class TransactionDataJSONParser {
	
	public List<TransactionRecord> parseJSONTransacionData(){
		// file IO and parse json txt then convert it to list
		
		return new ArrayList<>();
	}
	
	public void saveTranactionsAsJSON(List<TransactionRecord> transactionRecords) {
		
		// JAVA object to json and save to a file
		
	}

}
