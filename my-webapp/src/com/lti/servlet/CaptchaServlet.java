package com.lti.servlet;

import java.awt.Color;
import java.awt.Font;
//import java.awt.font.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

//import com.itextpdf.text.Font;

/**
 * Servlet implementation class CaptchaServlet
 */
@WebServlet("/captcha.jpg")
public class CaptchaServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("image/jpeg"); //MIME
		ServletOutputStream out = response.getOutputStream();
		
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String captchaText = "";
		for(int i=0; i<5; i++) {
			int rno = (int) (Math.random() * str.length());
			captchaText +=str.charAt(rno);
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("captchaText", captchaText);
		
		//code for generating an image
		
		BufferedImage img = new BufferedImage(130, 75, BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.RED);
		g.fillRect(0, 0, 130, 75);
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Harrington", Font.BOLD, 32));
		g.drawString(captchaText, 10, 50);
		
		ImageIO.write(img, "jpeg", out);
		
		
	}

	

}
