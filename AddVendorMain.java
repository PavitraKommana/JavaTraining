package com.java.jdbc.canteen;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
    public class AddVendorMain {
        public static void main(String[] args) throws ParseException{
            VendorDAO dao = new VendorDAO();
            Vendor vendor = new Vendor();
            int cid;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Vendor name ");
            vendor.setVen_name(sc.nextLine());
            System.out.println("Enter Vendor mail  ");
            vendor.setVen_email(sc.nextLine());
            System.out.println("Enter Vendor password  ");
            vendor.setVen_password(sc.nextLine());
            System.out.println("Enter  mobile no ");
            vendor.setVen_mobile(sc.nextLine());
            System.out.println("Enter vendor address ");
            vendor.setVen_address(sc.next());
            try {
                cid = dao.generateVendorId();
                vendor.setVen_id(cid);
                //System.out.println(cid);
System.out.println(dao.addVendor(vendor));
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }