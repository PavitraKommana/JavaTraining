package com.java.jdbc.canteen;

public class Vendor {
private int ven_id;
private String ven_name;
private String ven_password;
private String ven_email;
private String ven_mobile;
private String ven_address;
public int getVen_id() {
	return ven_id;
}
public void setVen_id(int ven_id) {
	this.ven_id = ven_id;
}
public String getVen_name() {
	return ven_name;
}
public void setVen_name(String ven_name) {
	this.ven_name = ven_name;
}
public String getVen_password() {
	return ven_password;
}
public void setVen_password(String ven_password) {
	this.ven_password = ven_password;
}
public String getVen_email() {
	return ven_email;
}
public void setVen_email(String ven_email) {
	this.ven_email = ven_email;
}
public String getVen_mobile() {
	return ven_mobile;
}
public void setVen_mobile(String ven_mobile) {
	this.ven_mobile = ven_mobile;
}
public String getVen_address() {
	return ven_address;
}
public void setVen_address(String ven_address) {
	this.ven_address = ven_address;
}
@Override
public String toString() {
	return "Vendor [ven_id=" + ven_id + ", ven_name=" + ven_name + ", ven_password=" + ven_password + ", ven_email="
			+ ven_email + ", ven_mobile=" + ven_mobile + ", ven_address=" + ven_address + "]";
}
public Vendor() {
	// TODO Auto-generated constructor stub
}
public Vendor(int ven_id, String ven_name, String ven_password, String ven_email, String ven_mobile, String ven_address) {
	this.ven_id = ven_id;
	this.ven_name = ven_name;
	this.ven_password = ven_password;
	this.ven_email = ven_email;
	this.ven_mobile = ven_mobile;
	this.ven_address = ven_address;
}



}