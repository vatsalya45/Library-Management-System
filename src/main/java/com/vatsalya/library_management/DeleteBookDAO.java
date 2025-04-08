package com.vatsalya.library_management;

import java.sql.*;


public class DeleteBookDAO {
	
	public int deleteBook(BookBean bb) {
		int k=0;
		try {
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps1=con.prepareStatement("delete from LibraryBook where bid=?");
			
			ps1.setString(1, bb.getbId());
			
			k=ps1.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return k;
		
	}

}