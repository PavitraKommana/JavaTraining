package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.util.Scanner;

public class AunthenCustomerMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Email: ");
		String cus_email=sc.nextLine();
		System.out.println("Enter Customer Password: ");
		String cus_password=sc.nextLine();
		try {
			int count=new CustomerDAO().authenCustomer(cus_email, cus_password);
			if(count==1)
			{
				System.out.println("*** CORRECT CREDENTIALS ***");
			}
			else
			{
				System.out.println("*** INCORRECT CREDENTIALS ***");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
