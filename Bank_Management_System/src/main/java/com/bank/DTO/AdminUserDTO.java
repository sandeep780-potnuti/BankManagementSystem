package com.bank.DTO;

public class AdminUserDTO {
	private String emailid;
	private String password;
	private String role;
	public AdminUserDTO() {
		// TODO Auto-generated constructor stub
	}
	public AdminUserDTO(String emailid, String password, String role) {
		super();
		this.emailid = emailid;
		this.password = password;
		this.role = role;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "AdminUserDTO [emailid=" + emailid + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
