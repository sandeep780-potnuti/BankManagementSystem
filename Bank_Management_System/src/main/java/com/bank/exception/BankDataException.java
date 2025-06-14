package com.bank.exception;

public class BankDataException extends RuntimeException {
	private String exceptionmsg;
	
	public BankDataException() {
		// TODO Auto-generated constructor stub
	}

	public BankDataException(String exceptionmsg) {
		super();
		this.exceptionmsg = exceptionmsg;
	}

	public String getExceptionmsg() {
		return exceptionmsg;
	}

	public void setExceptionmsg(String exceptionmsg) {
		this.exceptionmsg = exceptionmsg;
	}

	@Override
	public String toString() {
		return "BankDataException [exceptionmsg=" + exceptionmsg + "]";
	}
	
	
}
