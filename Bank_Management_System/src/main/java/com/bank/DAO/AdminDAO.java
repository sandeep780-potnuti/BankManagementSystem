package com.bank.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.AdminDetails;
import com.bank.repository.AdminRepository;

@Repository
public class AdminDAO {
	@Autowired
	private AdminRepository adminRepository;
	
	public AdminDetails insertAdminDetails(AdminDetails adminDetails) {
		System.out.println(adminRepository.getClass());
		AdminDetails save = adminRepository.save(adminDetails);
		return save;
	}
	public boolean getAdminDetailsByUsingId(int id) {
		Optional<AdminDetails> byId = adminRepository.findById(id);
		return byId.isPresent();
	}
}
