package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeTime")
public class LifeCycleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Get method");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("POST method");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		String param = config.getInitParameter("path");
		System.out.println("init param : " + param);
		System.out.println("INIT method");
	}
     
}
