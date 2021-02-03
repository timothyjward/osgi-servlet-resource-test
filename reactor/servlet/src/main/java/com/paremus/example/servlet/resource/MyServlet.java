package com.paremus.example.servlet.resource;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

@Component(service=Servlet.class)
@HttpWhiteboardServletName("MyServlet")
@HttpWhiteboardServletPattern("/servlet/*")
@HttpWhiteboardResource(pattern="/wsdl/*", prefix="static")
public class MyServlet extends HttpServlet implements Servlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello World");
	}
    
	
	
}
