package com_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		if(username.equals("Dance")&& password.equals("Payal"))
		{
			//out.println("dance!!!!!!");
			response.sendRedirect("Sucess.html");
		}
		else
		{
			//out.println("lalalala");
			response.sendRedirect("Error.html");
		}
	}

}
