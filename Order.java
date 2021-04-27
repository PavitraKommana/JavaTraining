package com.java.jdbc.canteen;

import java.sql.Date;

public class Order {
private int orderId;
private Date orderTime;
private int orderAmt;
private String orderLoc;
private String orderStatus;
private int orderQty;
private int Cus_id;
private int food_id;
private int ven_id;
private String wal_type;
private String ord_comm;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getOrderTime() {
	return orderTime;
}
public void setOrderTime(Date orderTime) {
	this.orderTime = orderTime;
}
public int getOrderAmt() {
	return orderAmt;
}
public void setOrderAmt(int orderAmt) {
	this.orderAmt = orderAmt;
}
public String getOrderLoc() {
	return orderLoc;
}
public void setOrderLoc(String orderLoc) {
	this.orderLoc = orderLoc;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
public int getOrderQty() {
	return orderQty;
}
public void setOrderQty(int orderQty) {
	this.orderQty = orderQty;
}
public int getCus_id() {
	return Cus_id;
}
public void setCus_id(int cus_id) {
	Cus_id = cus_id;
}
public int getFood_id() {
	return food_id;
}
public void setFood_id(int food_id) {
	this.food_id = food_id;
}
public int getVen_id() {
	return ven_id;
}
public void setVen_id(int ven_id) {
	this.ven_id = ven_id;
}
public String getWal_type() {
	return wal_type;
}
public void setWal_type(String wal_type) {
	this.wal_type = wal_type;
}
public String getOrd_comm() {
	return ord_comm;
}
public void setOrd_comm(String ord_comm) {
	this.ord_comm = ord_comm;
}
public Order(int orderId, Date orderTime, int orderAmt, String orderLoc, String orderStatus, int orderQty, int cus_id,
		int food_id, int ven_id, String wal_type, String ord_comm) {
	this.orderId = orderId;
	this.orderTime = orderTime;
	this.orderAmt = orderAmt;
	this.orderLoc = orderLoc;
	this.orderStatus = orderStatus;
	this.orderQty = orderQty;
	Cus_id = cus_id;
	this.food_id = food_id;
	this.ven_id = ven_id;
	this.wal_type = wal_type;
	this.ord_comm = ord_comm;
}
public Order() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderTime=" + orderTime + ", orderAmt=" + orderAmt + ", orderLoc="
			+ orderLoc + ", orderStatus=" + orderStatus + ", orderQty=" + orderQty + ", Cus_id=" + Cus_id + ", food_id="
			+ food_id + ", ven_id=" + ven_id + ", wal_type=" + wal_type + ", ord_comm=" + ord_comm + "]";
}




}