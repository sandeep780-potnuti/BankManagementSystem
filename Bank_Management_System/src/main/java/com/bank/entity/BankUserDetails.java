package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_User_Details")
public class BankUserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_Id")
	private int userid;
	@Column(name="User_Name",nullable = false)
	private String username;
	@Column(name="User_Emailid",nullable = false,unique = true)
	private String emailid;
	@Column(name="Aadhar_Number",nullable = false,unique = true)
	private long aadharnumber;
	@Column(name="Mobile_Number",nullable = false,unique = true)
	private long mobilenumber;
	@Column(name="Gender",nullable = false)
	private String gender;
	@Column(name="Address",nullable = false)
	private String address;
	@Column(name="Amount",nullable = false)
	private double amount;
	@Column(name="Account_Number")
	private int accountnumber;
	@Column(name="Pin_Number")
	private int pinnumber;
	public BankUserDetails() {
		// TODO Auto-generated constructor stub
	}
	public BankUserDetails(int userid, String username, String emailid, long aadharnumber, long mobilenumber,
			String gender, String address, double amount, int accountnumber, int pinnumber) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailid = emailid;
		this.aadharnumber = aadharnumber;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
		this.accountnumber = accountnumber;
		this.pinnumber = pinnumber;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getPinnumber() {
		return pinnumber;
	}
	public void setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	}
	@Override
	public String toString() {
		return "BankUserDetails [userid=" + userid + ", username=" + username + ", emailid=" + emailid
				+ ", aadharnumber=" + aadharnumber + ", mobilenumber=" + mobilenumber + ", gender=" + gender
				+ ", address=" + address + ", amount=" + amount + ", accountnumber=" + accountnumber + ", pinnumber="
				+ pinnumber + "]";
	}
	
	
}
