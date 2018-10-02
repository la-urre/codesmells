package com.eteration.demo.codesmells.dispensables.comments.refactored;

import java.util.Date;

public class AccountManager {
	/*Created standart account with minimum required data and returns new accountId
	 */
	public long createBasicAccount(String customerName,Date birhdate,int branchCode) {
		long createdAccountId = 80201002;
		
		return createdAccountId;
	}

}
