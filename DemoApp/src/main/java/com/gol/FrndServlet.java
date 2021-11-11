package com.gol;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FrndServlet extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hey");
		
		ServletConfig cg = getServletConfig();
		String str1 = cg.getInitParameter("Name");
		String str2 = cg.getInitParameter("Phone");
		
		out.println(str1);
		out.println("You are using a "+ str2 + " device");
	}

}
