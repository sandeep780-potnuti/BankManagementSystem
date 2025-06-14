package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.AdminDAO;
import com.bank.DTO.AdminUserDTO;
import com.bank.entity.AdminDetails;
import com.bank.exception.AdminDataException;
import com.bank.exception.AdminLoginException;

@Service
public class AdminService {
	@Autowired
	AdminDAO adminDAO;
	public boolean adminRegistration(AdminUserDTO adminUserDTO) {
		AdminDetails adminDetails=new AdminDetails();
		if (adminUserDTO.getEmailid().contains("@gmail.com")) {
			
		} else {
			throw new AdminDataException("Invalid Email");
		}
		if (adminUserDTO.getPassword().length()==4) {
			
		} else {
			throw new AdminDataException("Invalid Password");
		}
		adminDetails.setAdminemail(adminUserDTO.getEmailid());
		adminDetails.setAdminpassword(adminUserDTO.getPassword());
		adminDetails.setAdminrole(adminUserDTO.getRole());
		AdminDetails details = adminDAO.insertAdminDetails(adminDetails);
		if (details!=null) {
			return true;
		} else {
			throw new AdminDataException("Server 500 ERROR");
		}
	}
	public boolean adminLogin(int id) {
		if (adminDAO.getAdminDetailsByUsingId(id)) {
			return true;
		} else {
			throw new AdminLoginException("Invalid Admin Id");
		}
	}
}
