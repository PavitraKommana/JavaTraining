package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.util.Scanner;

public class ShowWalletMain {
public static void main(String[] args) {
	int cus_id;
	String wal_type;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter CustomerId: ");
	cus_id=Integer.parseInt(sc.nextLine());
	System.out.println("enter Wallet Type ");
	wal_type=sc.nextLine();
	WalletDAO dao=new WalletDAO();
	Wallet wallet;
	try {
		wallet=dao.showCustomerWalAmount(cus_id,wal_type);
		if(wallet!=null)
		{
			System.out.println(wallet);
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
