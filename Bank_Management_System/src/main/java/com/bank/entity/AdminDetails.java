package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin_Details")
public class AdminDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Admin_Id")
	private int adminid;
	@Column(name="Admin_Emailid",nullable = false,unique = true)
	private String adminemail;
	@Column(name="Admin_Password",nullable = false)
	private String adminpassword;
	@Column(name="Admin_Role",nullable = false)
	private String adminrole;
	
	public AdminDetails() {
		// TODO Auto-generated constructor stub
	}
	public AdminDetails(int adminid, String adminemail, String adminpassword, String adminrole) {
		super();
		this.adminid = adminid;
		this.adminemail = adminemail;
		this.adminpassword = adminpassword;
		this.adminrole = adminrole;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public String getAdminrole() {
		return adminrole;
	}
	public void setAdminrole(String adminrole) {
		this.adminrole = adminrole;
	}
	@Override
	public String toString() {
		return "AdminDetails [adminid=" + adminid + ", adminemail=" + adminemail + ", adminpassword="
				+ adminpassword + ", adminrole=" + adminrole + "]";
	}
	
	
}
