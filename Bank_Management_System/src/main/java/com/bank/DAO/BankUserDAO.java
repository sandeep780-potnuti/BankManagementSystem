package com.bank.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.BankUserDetails;
import com.bank.repository.BankUserRepository;
@Repository
public class BankUserDAO {
	@Autowired
	private BankUserRepository bankUserRepository;
	
	public BankUserDetails insertBankUserDetails(BankUserDetails bankUserDetails) {
		BankUserDetails save = bankUserRepository.save(bankUserDetails);
		System.out.println(bankUserRepository.getClass());
		return save;
	}
	public List<BankUserDetails> getAllUserDetails() {
		List<BankUserDetails> all = bankUserRepository.findAll();
		return all;
	}
	public boolean removeBankUserDetailsByUsingUserId(int id) {
		bankUserRepository.deleteById(id);
		return true;

	}
	public Optional<BankUserDetails> updateUserDetailsByUsingUserId(int id) {
		Optional<BankUserDetails> byId = bankUserRepository.findById(id);
		if (byId.isPresent()) {
			return byId;
		}
		return null;
	}
}
