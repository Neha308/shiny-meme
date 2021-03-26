package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.lti")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		String captchaText = (String) session.getAttribute("captchaText");
		
		String CaptchaText= request.getParameter("CaptchaText");
		if(captchaText.equals(CaptchaText)) {
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("Neha") && password.equals("neha123")) {
			String rememberMe = request.getParameter("rememberMe");
			if(rememberMe != null) {
				Cookie c1 = new Cookie("username", username);
				c1.setMaxAge(60*60); // 1 hr
				Cookie c2 = new Cookie("password", password);
				c2.setMaxAge(60*60);
				response.addCookie(c1);
				response.addCookie(c2);
				
			}
			
			response.sendRedirect("welcome.html");
		}
		else {
			response.sendRedirect("Login.html?error=111");
		}
		
	}
		else {
			response.sendRedirect("Login.html?error=222");
		}

	

}
	
}
