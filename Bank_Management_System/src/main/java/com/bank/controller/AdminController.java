package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.DTO.AdminUserDTO;
import com.bank.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	@RequestMapping("/adminreg")
	public String adminRegisterPage() {
		System.out.println("Admin registration page is called");
		return "AdminRegistration";
	}
	@RequestMapping("/adminreq")
	public String adminRequestPage(AdminUserDTO adminUserDTO) {
		if (adminService.adminRegistration(adminUserDTO)) {
			return "AdminLogin";
		}
		return null;
	}
	@RequestMapping("/login")
	public String adminLoginRequest() {
		return "AdminLogin";
	}
	//@ResponseBody
	@RequestMapping("/adminLogin")
	public String adminLoginRequest(@RequestParam("Aid") int id) {
		if (adminService.adminLogin(id)) {
			return "redirect:/magadha/allUsersDetails";
		} else {
			return null;
		}
	}
}
