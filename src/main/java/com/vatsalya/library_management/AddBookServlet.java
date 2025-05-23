package com.vatsalya.library_management;

import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/addBook")

public class AddBookServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			
			BookBean bb=new BookBean();
			
			bb.setbId(req.getParameter("bId"));
			bb.setbName(req.getParameter("bName"));
			bb.setbAuthor(req.getParameter("bAuthor"));
			bb.setbPrice(Integer.parseInt(req.getParameter("bPrice")));
			bb.setbQty(Integer.parseInt(req.getParameter("bQty")));
			
			int k= new AddBookDAO().insertBook(bb);
			
			if(k>0) {
	
				req.setAttribute("msg","Added Sucessfully..");
				req.getRequestDispatcher("AddBook.jsp").forward(req, res);
				
		}else {
			req.setAttribute("msg","record not added..");
			req.getRequestDispatcher("AddBook.jsp").forward(req, res);
			
		}
		
		
		
		}
		
		
	}

}