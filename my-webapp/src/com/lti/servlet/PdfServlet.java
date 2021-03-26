package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class PdfServlet
 */
@WebServlet("/PdfServlet")
public class PdfServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("application/pdf");  //MIME
		
		try {
			Document document= new Document();
			PdfWriter.getInstance(document, response.getOutputStream());
			document.open();
			document.add(new Paragraph("Hello World!"));
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}

	

}
