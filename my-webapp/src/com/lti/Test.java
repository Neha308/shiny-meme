package com.lti;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("hello.pdf"));
		document.open();
		document.add(new Paragraph("Hello World!!"));
		document.close();

	}

}
