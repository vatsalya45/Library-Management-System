package com.vatsalya.library_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO {

	public AdminBean ab = null;
	
	public AdminBean login(String uN,  String pW) {
		
		try {
			
			Connection con = DBConnection.getCon();//Accessing connection reference
			
			PreparedStatement ps = con.prepareStatement("select * from LibraryAdmin where aname = ? and password = ?");
			
			
			ps.setString(1, uN);
			ps.setString(2, pW);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				ab = new AdminBean();//AdminBean Object
				ab.setaName(rs.getString(1));
				ab.setPassword(rs.getString(2));
				ab.setfName(rs.getString(3));
				ab.setlName(rs.getString(4));
				ab.setMailID(rs.getString(5));
				ab.setPhNo(rs.getLong(6));
				
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ab;
	}
}
