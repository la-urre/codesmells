package com.eteration.demo.codesmells.bloaters.primitiveobsession.refactored;

import java.util.Date;

public class DateRange {

	private Date start;
	private Date end;

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

}
