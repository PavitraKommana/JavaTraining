package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddCustomerMain {

	public static void main(String[] args) throws ParseException {
		
		CustomerDAO dao= new CustomerDAO();
		Customer customer=new Customer();
		
		int cid;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter CustomerName: ");
		customer.setCus_name(sc.nextLine());
		System.out.println("Enter Password: ");
		customer.setCus_password(sc.nextLine());
		System.out.println("Enter Email: ");
		customer.setCus_email(sc.nextLine());
		System.out.println("Enter Mobile: ");
		customer.setCus_mobile(sc.nextLine());
		System.out.println("Enter DateOfBirth: ");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dt=sdf.parse(sc.nextLine());
		java.sql.Date sqlDate=new java.sql.Date(dt.getTime());
		customer.setCus_dob(sqlDate);
		System.out.println("Enter Address: ");
		customer.setCus_address(sc.nextLine());
		
		try {
			cid=dao.generateCustomerId();
			customer.setCus_id(cid);
			System.out.println(dao.addCustomer(customer));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
