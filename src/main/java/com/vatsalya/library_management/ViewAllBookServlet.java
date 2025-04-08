package com.vatsalya.library_management;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/view")

public class ViewAllBookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			
			ArrayList<BookBean> al=new ViewAllBookDAO().retrieveBook();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("ViewAllBook.jsp").forward(req, res);
		}
	}

}