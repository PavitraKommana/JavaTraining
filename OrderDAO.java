package com.java.jdbc.canteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDAO {
Connection con;
PreparedStatement pst;
public int generateid() throws SQLException
{
	con=ConnectionHelper.getConnection();
	String cmd="select case when max(orderId) is NUll then 1"
			   + "else max(orderId)+1 end oid from customer";
	pst=con.prepareStatement(cmd);
	ResultSet rs=pst.executeQuery();
	rs.next();
	int oid=rs.getInt("oid");
	return oid;
}

public String placeOrder(Order order,int qty)
{
	int food_id=order.getFood_id();
	
	double price = order.getFood_id();
	return null;
}


}
