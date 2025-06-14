package com.bank.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdminExceptionHandler {
	@ExceptionHandler(AdminDataException.class)
	public String adminDataExceptionHandler(AdminDataException ad,Model model) {
		System.out.println("Admin Data is Handled...");
		String msg = ad.getMsg();
		model.addAttribute("adminexception", msg);
		return "AdminRegistration";
	}
	@ExceptionHandler(AdminLoginException.class)
	public String adminLoginExceptionHandler(AdminLoginException al,Model model) {
		String exceptionmsg = al.getExceptionmsg();
		model.addAttribute("loginexception", exceptionmsg);
		return "AdminLogin";
	}
}
