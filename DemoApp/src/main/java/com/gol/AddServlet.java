
package com.gol;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
//		PrintWriter out= res.getWriter();
//		out.println("result is "+ k);
		
		
//		---Calling servlet from servlet using Request Dispatcher--
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);

//		---Calling servlet from servlet using Send Redirect--
		
//		---URL manipulation---		
//		res.sendRedirect("sq?k="+ k);

//		---Session Management---
//		HttpSession session= req.getSession();
//		session.setAttribute("k", k);
		
//		---Cookie Management---
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		
		res.sendRedirect("sq");
				
	}

}
