package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchVendor {
public static void main(String[] args) {
	int ven_id;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Vendor Id: ");
     ven_id=sc.nextInt();
	VendorDAO dao=new VendorDAO();
	Vendor vendor;
	try {
		vendor=dao.searchVendor(ven_id);
		if(vendor!=null)
		{
			System.out.println(vendor);
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