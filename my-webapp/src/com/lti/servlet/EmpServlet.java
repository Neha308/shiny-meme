package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("application/vnd.ms-excel");  //MIME types - /pdf, /vnd.ms-excel
		PrintWriter out = response.getWriter();
		
		out.println("Empno\tName\tSalary");
		out.println("100\tNeha\t10000");
		out.println("101\tHimesh\t20000");
		out.println("102\tSmita\t300000");
		
	}

	

}
