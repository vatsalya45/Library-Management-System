package com.vatsalya.library_management;

import java.sql.*;

public class AdminRegisterDAO {
	
	
	
	public int insert(AdminBean ab) {
		 int k=0;
		try {
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps1=con.prepareStatement("insert into LibraryAdmin values(?,?,?,?,?,?)");
			
			ps1.setString(1, ab.getuName());
			ps1.setString(2, ab.getpWord());
			ps1.setString(3, ab.getfName());
			ps1.setString(4, ab.getlName());
			ps1.setString(5, ab.getmId());
			ps1.setLong(6, ab.getPhNo());
			
			 k= ps1.executeUpdate();


			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
		
		
	}

}