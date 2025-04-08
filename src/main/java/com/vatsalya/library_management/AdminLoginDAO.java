package com.vatsalya.library_management;

import java.sql.*;



public class AdminLoginDAO {

	public AdminBean ab=null;
	public AdminBean login(String uN,String pW) {
		try {
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps=con.prepareStatement("Select * from LibraryAdmin where aname=? and password=?");
			
			ps.setString(1,uN);
			ps.setString(2, pW);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ab=new AdminBean();
				ab.setuName(rs.getString(1));
				ab.setpWord(rs.getString(2));
				ab.setfName(rs.getString(3));
				ab.setlName(rs.getString(4));
				ab.setmId(rs.getString(5));
				ab.setPhNo(rs.getLong(6));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ab;
	}
}