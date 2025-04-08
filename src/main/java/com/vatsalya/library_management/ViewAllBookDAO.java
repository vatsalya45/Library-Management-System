package com.vatsalya.library_management;

import java.util.*;
import java.sql.*;

public class ViewAllBookDAO {

	
	public ArrayList<BookBean> al=new ArrayList<BookBean>();
	
	public ArrayList<BookBean> retrieveBook(){
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps1=con.prepareStatement("select * from LibraryBook");
			
			ResultSet rs=ps1.executeQuery();
			
			while(rs.next()) {
				BookBean bb=new BookBean();
				bb.setbId(rs.getString(1));
				bb.setbName(rs.getString(2));
				bb.setbAuthor(rs.getString(3));
				bb.setbPrice(rs.getInt(4));
				bb.setbQty(rs.getInt(5));
				al.add(bb);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}