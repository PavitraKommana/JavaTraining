package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.util.Scanner;
public class SearchVendorMain {
    public static void main(String[] args) {
        int ven_id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vendor No  ");
        ven_id= sc.nextInt();
        Vendor vendor;
		try {
			vendor = new VendorDAO().searchVendor(ven_id);
			if (vendor != null) {
	            System.out.println(vendor);
	        } else {
	            System.out.println("*** Record Not Found ***");
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}