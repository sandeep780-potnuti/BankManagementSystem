package com.bank.DTO;

public class BankUserDTO {
	private String name;
	private String email;
	private long aadharnumber;
	private long mobilenumber;
	private String gender;
	private String address;
	private double amount;
	public BankUserDTO() {
		// TODO Auto-generated constructor stub
	}
	public BankUserDTO(String name, String email, long aadharnumber, long mobilenumber, String gender, String address,
			double amount) {
		super();
		this.name = name;
		this.email = email;
		this.aadharnumber = aadharnumber;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankUserDTO [name=" + name + ", email=" + email + ", aadharnumber=" + aadharnumber + ", mobilenumber="
				+ mobilenumber + ", gender=" + gender + ", address=" + address + ", amount=" + amount + "]";
	}
	
	
}
