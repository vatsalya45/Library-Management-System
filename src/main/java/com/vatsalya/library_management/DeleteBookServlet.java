package com.vatsalya.library_management;

import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/deleteBook")
public class DeleteBookServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			
			BookBean bb=new BookBean();
			
			bb.setbId(req.getParameter("bId"));
			
			int k= new DeleteBookDAO().deleteBook(bb);
			
			if(k>0) {
	
				req.setAttribute("msg","Deleted Sucessfully..");
				req.getRequestDispatcher("DeleteBook.jsp").forward(req, res);
				
		}else {
			req.setAttribute("msg","Record not found..");
			req.getRequestDispatcher("DeleteBook.jsp").forward(req, res);
			
			}
		}
	}
}