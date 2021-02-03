package com.paremus.example.servlet.resource.toplevelservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

@Component(service=Servlet.class)
@HttpWhiteboardServletName("MyTopLevelServlet")
@HttpWhiteboardServletPattern("/*")
public class MyServlet extends HttpServlet implements Servlet {
    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello Top Level World");
	}
    
    
}
