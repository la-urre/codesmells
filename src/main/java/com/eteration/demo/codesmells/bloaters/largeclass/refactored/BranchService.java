package com.eteration.demo.codesmells.bloaters.largeclass.refactored;

public class BranchService extends BaseJDBCService {
	public void searchBranch() {

		SecurityUtils.hasUserAccess(TransactionType.UPDATE_PASWORD);

		// validate inputs/query

		getConnection();

		// perform operation

		cleanupConnection();

	}

	public void addBranch() {

		SecurityUtils.hasUserAccess(TransactionType.UPDATE_PASWORD);

		// validate inputs/query

		getConnection();

		// perform operation

		cleanupConnection();

	}

}
