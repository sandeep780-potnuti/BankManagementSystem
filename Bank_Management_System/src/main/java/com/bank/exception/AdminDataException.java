package com.bank.exception;

public class AdminDataException extends RuntimeException{
	private String msg;
	public AdminDataException() {
		// TODO Auto-generated constructor stub
	}

	public AdminDataException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "AdminDataException [msg=" + msg + "]";
	}
	
	 
}
