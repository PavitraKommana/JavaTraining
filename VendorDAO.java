package com.java.jdbc.canteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendorDAO {
	Connection con;
	PreparedStatement pst;
	
	public int generateVendorId() throws SQLException
	{
		con=ConnectionHelper.getConnection();
		String cmd="select case when max(ven_id) is NUll then 1"
				   + "else max(ven_id)+1 end vid from Vendor";
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int vid=rs.getInt("vid");
		return vid;
	}
	
	public String addVendor(Vendor vendor) throws SQLException
	{
		con=ConnectionHelper.getConnection();
		String cmd="insert into Vendor(ven_id,ven_name,ven_password,ven_email,ven_mobile,ven_address) values(?,?,?,?,?,?)";
		int venid=generateVendorId();
		pst=con.prepareStatement(cmd);
		
		pst.setInt(1, venid);
		pst.setString(2, vendor.getVen_name());
		pst.setString(3, vendor.getVen_password());
		pst.setString(4, vendor.getVen_email());
		pst.setString(5, vendor.getVen_mobile());
		pst.setString(6, vendor.getVen_address());
		pst.executeUpdate();
		return "**CREATED SUCCESSFULLY**";
	}
	
	
	public Vendor searchVendor(int ven_id) throws SQLException
	{
		Vendor vendor=null;
		con=ConnectionHelper.getConnection();
		String cmd="select * from Vendor where ven_id=?";
		pst=con.prepareStatement(cmd);
		pst.setInt(1,ven_id);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			vendor=new Vendor();
			vendor.setVen_id(ven_id);
			vendor.setVen_name(rs.getString("ven_name"));
			vendor.setVen_password(rs.getString("ven_password"));
			vendor.setVen_email(rs.getString("ven_email"));
			vendor.setVen_mobile(rs.getString("ven_mobile"));
			vendor.setVen_address(rs.getString("ven_address"));
			
		}
	  return vendor;
	}
	
	public int authenVendor(String ven_email,String ven_password) throws SQLException
	{
		con=ConnectionHelper.getConnection();
		String cmd="select count(*) cnt from Vendor where ven_email=? and ven_password=?";
		pst=con.prepareStatement(cmd);
		pst.setString(1,ven_email);
		pst.setString(2, ven_password);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int cnt= rs.getInt("cnt");
		return cnt;
	}
}

	
	
