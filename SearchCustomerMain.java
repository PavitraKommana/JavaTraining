package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchCustomerMain {

	public static void main(String[] args) {
		int cus_id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustomerId: ");
		cus_id=sc.nextInt();
		CustomerDAO dao=new CustomerDAO();
		Customer customer;
		try {
			customer=dao.searchCustomer(cus_id);
			if(customer!=null)
			{
				System.out.println(customer);
			}
			else
			{
				System.out.println("*** RECORD NOT FOUND ***");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
