package com.MeuPrimeiroServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/index", "/","/main"})
public class ServletTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String method = request.getMethod();
	if(method.equals("GET")) {
		System.out.println("Passei pelo service - GET");
		doGet(request, response);
		
	}
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getServletPath().equals("/index")||request.getServletPath().equals("/main")) {
			PrintWriter out = response.getWriter();
			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Hello Servlet Teste</h1>");
			out.println("Lucas - Teste Servlet\n");
			out.println("Primeira página dinâmica em HTML");
			out.println("</body>");
			out.println("</html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
