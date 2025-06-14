package com.bank.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BankExceptionHandler {
	//@ResponseBody
	@ExceptionHandler(BankDataException.class)
	public String bankDataExceptionHandler(BankDataException bd,Model model) {
		System.out.println("Bank Data is Handled...");
		String exceptionmsg = bd.getExceptionmsg();
		model.addAttribute("exceptionmsg", exceptionmsg);
		return "BankRegistration";

	}
	
}
