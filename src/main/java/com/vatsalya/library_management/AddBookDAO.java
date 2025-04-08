package com.vatsalya.library_management;

import java.sql.*;

public class AddBookDAO {
	
	public int insertBook(BookBean bb) {
		int k=0;
		try {
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps1=con.prepareStatement("insert into LibraryBook values(?,?,?,?,?)");
			
			ps1.setString(1, bb.getbId());
			ps1.setString(2, bb.getbName());
			ps1.setString(3, bb.getbAuthor());
			ps1.setInt(4, bb.getbPrice());
			ps1.setInt(5, bb.getbQty());
			
			k=ps1.executeUpdate();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}