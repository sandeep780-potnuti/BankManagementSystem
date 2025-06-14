package com.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.service.BankService;

@Controller
public class BankController {
	@Autowired
	private BankService bankService;

	@RequestMapping("/regpage")
	public String bankRegistrationPage() {
		System.out.println("Bank Registration page is called");
		return "BankRegistration";

	}

	@RequestMapping("/registrationrequest")
	public void registrationPageRequest(BankUserDTO bankUserDTO) {
		bankService.bankRegistration(bankUserDTO);
	}
	@RequestMapping("/allUsersDetails")
	public String getAllUsers(Model model) {
		List<BankUserDetails> list = bankService.selectAllUserDetails();
		model.addAttribute("listOfUsers", list);
		return "AllUsersDetails";

	}
	@RequestMapping("/deleteUserDetails")
	public String deleteBankUserDetails(int userid) {
		System.out.println(userid);
		if (bankService.deleteUserDetails(userid)) {
			return "redirect:/magadha/allUsersDetails";			
		}
		return null;
		

	}
	@RequestMapping("/updateUserDetails")
	public String updateBankUserDetails(int id,Model model) {
		System.out.println(id);
		Optional<BankUserDetails> updateUserDetails = bankService.updateUserDetails(id);
		model.addAttribute("UserDetails", updateUserDetails);
		return "UpdateUserDetails";
		
	}

}
