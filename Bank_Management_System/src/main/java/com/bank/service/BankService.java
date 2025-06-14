package com.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.BankUserDAO;
import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.exception.BankDataException;

@Service
public class BankService {
	@Autowired
	BankUserDAO bankUserDAO;

	public void bankRegistration(BankUserDTO bankUserDTO) {
		System.out.println(bankUserDTO + "Service");
		BankUserDetails bankUserDetails = new BankUserDetails();
		if (bankUserDTO.getEmail().contains("@gmail.com")) {

		} else {
			throw new BankDataException("Invalid Emailid");
		}
		long mobile = bankUserDTO.getMobilenumber();
		if (mobile >= 6000000000l && mobile <= 9999999999l) {

		} else {
			throw new BankDataException("Invalid Mobile Number");
		}
		long aadhar = bankUserDTO.getAadharnumber();
		int count = 0;
		while (aadhar > 0) {
			count++;
			aadhar = aadhar / 10;
		}
		if (count == 12) {

		} else {
			throw new BankDataException("Invalid Aadhar Number");
		}
		bankUserDetails.setUsername(bankUserDTO.getName());
		bankUserDetails.setEmailid(bankUserDTO.getEmail());
		bankUserDetails.setAadharnumber(bankUserDTO.getAadharnumber());
		bankUserDetails.setMobilenumber(bankUserDTO.getMobilenumber());
		bankUserDetails.setAddress(bankUserDTO.getAddress());
		bankUserDetails.setGender(bankUserDTO.getGender());
		bankUserDetails.setAmount(bankUserDTO.getAmount());
		bankUserDAO.insertBankUserDetails(bankUserDetails);

	}

	public List<BankUserDetails> selectAllUserDetails() {
		return bankUserDAO.getAllUserDetails();
	}

	public boolean deleteUserDetails(int userid) {
		return bankUserDAO.removeBankUserDetailsByUsingUserId(userid);

	}
	public Optional<BankUserDetails> updateUserDetails(int id) {
		Optional<BankUserDetails> optional = bankUserDAO.updateUserDetailsByUsingUserId(id);
		return optional;

	}

}
