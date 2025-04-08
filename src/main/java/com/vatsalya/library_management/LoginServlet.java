package com.vatsalya.library_management;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/aLogin")

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException{
		
		String uN=req.getParameter("uname");
		String pW=req.getParameter("pword");
		AdminBean ab=new AdminLoginDAO().login(uN, pW);
		
		if(ab==null) {
			req.setAttribute("msg", "Invalid Login Details...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			
			HttpSession hs=req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("LoginSucess.jsp").forward(req, res);
			
		}
	}
}