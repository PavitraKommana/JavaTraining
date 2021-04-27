package com.java.jdbc.canteen;

public class FoodItem {
private int food_Id;
private String food_name;
private String food_detail;
private int food_price;
private String food_status;
private String food_rating;
public FoodItem(int food_Id, String food_name, String food_detail, int food_price, String food_status,
		String food_rating) {
	this.food_Id = food_Id;
	this.food_name = food_name;
	this.food_detail = food_detail;
	this.food_price = food_price;
	this.food_status = food_status;
	this.food_rating = food_rating;
}
public FoodItem() {
	// TODO Auto-generated constructor stub
}
public int getFood_Id() {
	return food_Id;
}
public void setFood_Id(int food_Id) {
	this.food_Id = food_Id;
}
public String getFood_name() {
	return food_name;
}
public void setFood_name(String food_name) {
	this.food_name = food_name;
}
public String getFood_detail() {
	return food_detail;
}
public void setFood_detail(String food_detail) {
	this.food_detail = food_detail;
}
public int getFood_price() {
	return food_price;
}
public void setFood_price(int food_price) {
	this.food_price = food_price;
}
public String getFood_status() {
	return food_status;
}
public void setFood_status(String food_status) {
	this.food_status = food_status;
}
public String getFood_rating() {
	return food_rating;
}
public void setFood_rating(String food_rating) {
	this.food_rating = food_rating;
}
@Override
public String toString() {
	return "FoodItem [food_Id=" + food_Id + ", food_name=" + food_name + ", food_detail=" + food_detail
			+ ", food_price=" + food_price + ", food_status=" + food_status + ", food_rating=" + food_rating + "]";
}




}