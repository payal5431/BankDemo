package com_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletDep")
public class ServletDep extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s= request.getSession();
		int s1=1000;
		s.setAttribute("ss1",s1);
		int a= Integer.parseInt(request.getParameter("amt"));
		PrintWriter out=response.getWriter();
		out.println(a+s1);
	}

	
}
