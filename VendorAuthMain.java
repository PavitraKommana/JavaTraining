package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.util.Scanner;

public class VendorAuthMain {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Vendor Email: ");
	String ven_email=sc.nextLine();
	System.out.println("Enter Vendor Password: ");
	String ven_password=sc.nextLine();
	try {
		int count=new VendorDAO().authenVendor(ven_email, ven_password);
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
