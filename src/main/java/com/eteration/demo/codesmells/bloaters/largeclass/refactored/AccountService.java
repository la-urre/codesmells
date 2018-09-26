package com.eteration.demo.codesmells.bloaters.largeclass.refactored;

public class AccountService extends BaseJDBCService {

	private NotificationService notificationService = new NotificationService();

	public void createAccount() {

		SecurityUtils.hasUserAccess(TransactionType.CREATE_ACCOUNT);

		// validate inputs/query

		getConnection();

		// perform operation

		notificationService.sendNotification();

		cleanupConnection();
	}

	public void listAccount() {
		SecurityUtils.hasUserAccess(TransactionType.LIST_ACCOUNT);

		// validate inputs/query

		getConnection();

		// perform operation

		notificationService.sendNotification();

		cleanupConnection();
	}

	public void transferToAccount() {

		SecurityUtils.hasUserAccess(TransactionType.EFT);

		// validate inputs/query

		getConnection();

		// perform operation

		notificationService.sendNotification();

		cleanupConnection();

	}
}
