package com.java.jdbc.canteen;

public class Wallet {
private int wal_id;
private int wal_amount;
private String wal_type;
public Wallet(int wal_id, int wal_amount, String wal_type) {
	this.wal_id = wal_id;
	this.wal_amount = wal_amount;
	this.wal_type = wal_type;
}
public Wallet() {
	// TODO Auto-generated constructor stub
}
public int getWal_id() {
	return wal_id;
}
public void setWal_id(int wal_id) {
	this.wal_id = wal_id;
}
public int getWal_amount() {
	return wal_amount;
}
public void setWal_amount(int wal_amount) {
	this.wal_amount = wal_amount;
}
public String getWal_type() {
	return wal_type;
}
public void setWal_type(String wal_type) {
	this.wal_type = wal_type;
}
@Override
public String toString() {
	return "Wallet [wal_id=" + wal_id + ", wal_amount=" + wal_amount + ", wal_type=" + wal_type + "]";
}


}
