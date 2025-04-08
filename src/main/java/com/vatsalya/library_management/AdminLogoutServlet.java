package com.vatsalya.library_management;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")

public class AdminLogoutServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException{
		
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			req.setAttribute("msg", "Admin Logout Sucessfully...");
			req.getRequestDispatcher("AdminLogout.jsp").forward(req, res);
		}
		
	}
}