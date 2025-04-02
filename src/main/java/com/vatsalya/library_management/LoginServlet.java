package com.vatsalya.library_management;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String uN = req.getParameter("aname");
		String pW = req.getParameter("password");
		
		AdminBean ab = new AdminLoginDAO().login(uN, pW);
		
		if(ab==null) {
			
			req.setAttribute("msg","Invalid login process <br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			
			HttpSession hs = req.getSession();//creating new session
			hs.setAttribute("abean", ab);//AdminBean is added to session 
			req.getRequestDispatcher("AdminLoginSuccess.jsp").forward(req, res);
			
		}
		
	}

}





