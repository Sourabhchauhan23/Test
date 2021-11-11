package com.gol;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out =  res.getWriter();
		out.println("Hey");
		
		
//		ServletContext will be shared with all the Servlets.
		
		ServletContext ctx = req.getServletContext();
		String str1 = ctx.getInitParameter("Name");
		String str2 = ctx.getInitParameter("Phone");
		
		out.println(str1);
		out.println("You are using a "+ str2 + " device");
		
	}
	
	

}
