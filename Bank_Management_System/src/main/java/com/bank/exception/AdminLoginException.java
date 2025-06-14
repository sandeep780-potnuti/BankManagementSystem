package com.bank.exception;

public class AdminLoginException extends RuntimeException {
	private String exceptionmsg;

	public AdminLoginException(String exceptionmsg) {
		super();
		this.exceptionmsg = exceptionmsg;
	}
	
	public AdminLoginException() {
		// TODO Auto-generated constructor stub
	}
	public String getExceptionmsg() {
		return exceptionmsg;
	}

	public void setExceptionmsg(String exceptionmsg) {
		this.exceptionmsg = exceptionmsg;
	}

	@Override
	public String toString() {
		return "AdminLoginException [exceptionmsg=" + exceptionmsg + "]";
	}
	
	
}
