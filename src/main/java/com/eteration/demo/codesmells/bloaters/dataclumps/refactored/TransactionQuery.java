package com.eteration.demo.codesmells.bloaters.dataclumps.refactored;

import com.eteration.demo.codesmells.bloaters.primitiveobsession.refactored.DateRange;

public class TransactionQuery {
	private DateRange interval;
	private int count;

	public DateRange getInterval() {
		return interval;
	}

	public void setInterval(DateRange interval) {
		this.interval = interval;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
