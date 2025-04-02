package com.vatsalya.library_management;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddBookServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException{
		
		BookBean bb = new BookBean();
		
		bb.setbId(req.getParameter("bid"));
		bb.setbName(req.getParameter("bname"));
		bb.setaName(req.getParameter("aname"));
		bb.setbPrice(Float.parseFloat(req.getParameter("bprice")));//use parse always
		bb.setbQty(Integer.parseInt(req.getParameter("bqty")));
		
	}
}
