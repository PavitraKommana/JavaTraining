package com.java.jdbc.canteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletDAO {
	Connection con;
	PreparedStatement pst;
	
	
 public Wallet showCustomerWalAmount(int cusid,String waltype) throws SQLException
 {
	 Wallet wallet=null;
		con=ConnectionHelper.getConnection();
	String cmd="select * from Wallet where cus_id=? and wal_type=?";
	pst=con.prepareStatement(cmd);
	pst.setInt(1, cusid);
	pst.setString(2, waltype);
	ResultSet rs=pst.executeQuery();
	if(rs.next())
	{
		wallet=new Wallet();
		wallet.setWal_id(rs.getInt("wal_id"));
		wallet.setWal_amount(rs.getInt("wal_amount"));
		wallet.setWal_type(waltype);
	}
	return wallet;
 }
}
