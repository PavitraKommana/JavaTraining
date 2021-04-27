package com.java.jdbc.canteen;

import java.util.Date;

public class Customer {

	private int cus_id;
	private String cus_name;
	private String cus_password;
	private String cus_email;
	private String cus_mobile;
	private Date cus_dob;
	private String cus_address;
	
	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getCus_password() {
		return cus_password;
	}

	public void setCus_password(String cus_password) {
		this.cus_password = cus_password;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	public String getCus_mobile() {
		return cus_mobile;
	}

	public void setCus_mobile(String cus_mobile) {
		this.cus_mobile = cus_mobile;
	}

	public Date getCus_dob() {
		return cus_dob;
	}

	public void setCus_dob(Date cus_dob) {
		this.cus_dob = cus_dob;
	}

	public String getCus_address() {
		return cus_address;
	}

	public void setCus_address(String cus_address) {
		this.cus_address = cus_address;
	}

	public Customer(int cus_id, String cus_name, String cus_password, String cus_email, String cus_mobile,
			Date cus_dob, String cus_address) {
		super();
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_password = cus_password;
		this.cus_email = cus_email;
		this.cus_mobile = cus_mobile;
		this.cus_dob = cus_dob;
		this.cus_address = cus_address;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_name=" + cus_name + ", cus_password=" + cus_password
				+ ", cus_email=" + cus_email + ", cus_mobile=" + cus_mobile + ", cus_dob=" + cus_dob
				+ ", cus_address=" + cus_address + "]";
	}
}
