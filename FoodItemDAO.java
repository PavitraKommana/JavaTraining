package com.java.jdbc.canteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodItemDAO {
	Connection con;
	PreparedStatement pst;
	
	public int generateFoodId() throws SQLException
	{
		con=ConnectionHelper.getConnection();
		String cmd="select case when max(food_id) is NUll then 1"
				   + "else max(food_id)+1 end vid from food_item";
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int fid=rs.getInt("fid");
		return fid;
	}
	
	
	
	public FoodItem searchFoodItem(int food_id) throws SQLException
	{
		FoodItem fooditem=null;
		con=ConnectionHelper.getConnection();
		String cmd="select * from food_item where food_id=?";
		pst=con.prepareStatement(cmd);
		pst.setInt(1,food_id);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			fooditem=new FoodItem();
			fooditem.setFood_Id(food_id);
			fooditem.setFood_name(rs.getString("food_name"));
			fooditem.setFood_detail(rs.getString("food_detail"));
			fooditem.setFood_price(rs.getInt("food_price"));
			fooditem.setFood_status(rs.getString("food_status"));
			fooditem.setFood_rating(rs.getString("food_rating"));
		}
	  return fooditem;
	}
	

}
