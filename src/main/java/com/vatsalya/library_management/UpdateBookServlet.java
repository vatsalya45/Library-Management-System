package com.vatsalya.library_management;

import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/updateBook")
public class UpdateBookServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			@SuppressWarnings("unchecked")
			ArrayList<BookBean> al=(ArrayList<BookBean> )hs.getAttribute("alist");
			
			String bId=req.getParameter("bId");
			Iterator<BookBean> it=al.iterator();
			while(it.hasNext()) {
				BookBean bb=(BookBean) it.next();
				
				if(bId.equals(bb.getbId())) {
//					bb.setbId(req.getParameter("bId"));
					bb.setbName(req.getParameter("bName"));
					bb.setbAuthor(req.getParameter("bAuthor"));
					bb.setbPrice(Integer.parseInt(req.getParameter("bPrice")));
					bb.setbQty(Integer.parseInt(req.getParameter("bQty")));
					
					int k=new UpdateBookDAO().updateBook(bb);
					
					if(k>0) {
						req.setAttribute("msg","Updated Sucessfully...");
						req.getRequestDispatcher("UpdateBook.jsp").forward(req, res);
						
					}else{
						req.setAttribute("msg","Record not found...");
						req.getRequestDispatcher("UpdateBook.jsp").forward(req, res);
						
					}
				}
			}
			
			
		}
	}
		
}