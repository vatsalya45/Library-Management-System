package com.vatsalya.library_management;

import java.sql.*;

public class UpdateBookDAO {
	public int k=0;
	public int updateBook(BookBean bb) {
		 
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps1=con.prepareStatement("update LibraryBook set bname=?,aname=?,bprice=?,bqty=? where bid=?");
			
			ps1.setString(1, bb.getbName());
			ps1.setString(2, bb.getbAuthor());
			ps1.setInt(3, bb.getbPrice());
			ps1.setInt(4, bb.getbQty());
			ps1.setString(5, bb.getbId());
			
			k=ps1.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
	}
}