package com_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletWid
 */
@WebServlet("/ServletWid")
public class ServletWid extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s= request.getSession();
		int s2=(int)s.getAttribute("ss1");;
		int b= Integer.parseInt(request.getParameter("amt"));
		PrintWriter out=response.getWriter();
		int s5=s2-b;
		out.println(s5);
	}

}
