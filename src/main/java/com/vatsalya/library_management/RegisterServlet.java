package com.vatsalya.library_management;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/aRegister")

public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException{
		
		AdminBean ab= new AdminBean();
		ab.setuName(req.getParameter("uName"));
		ab.setpWord(req.getParameter("pWord"));
		ab.setfName(req.getParameter("fName"));
		ab.setlName(req.getParameter("lName"));
		ab.setmId(req.getParameter("mId"));
		ab.setPhNo(Long.parseLong(req.getParameter("phNo")));
		
		
		int k = new AdminRegisterDAO().insert(ab);
		
		if(k>0) {
			req.setAttribute("msg", "Register Sucessfull..");
			req.getRequestDispatcher("home.html").forward(req, res);
		}
		else {
			req.setAttribute("msg","Something went wrong!");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		
	}

}
