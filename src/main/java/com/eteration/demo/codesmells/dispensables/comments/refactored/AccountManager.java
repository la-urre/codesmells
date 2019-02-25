package com.eteration.demo.codesmells.dispensables.comments.refactored;

import java.util.Date;
import java.util.UUID;

public class AccountManager {
	/*Created default account with minimum  required fieldss
	 */
	public long createBasicAccount(String customerName,Date birhdate,int branchCode) {
		long createdAccountId = UUID.randomUUID().getMostSignificantBits();
		
		return createdAccountId;
	}

}
