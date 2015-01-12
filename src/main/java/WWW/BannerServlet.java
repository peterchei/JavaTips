package WWW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BannerServlet extends HttpServlet { 
	  public void doGet (HttpServletRequest request,
	    HttpServletResponse response)
	    throws ServletException, IOException {
	      output(request, response);
	  }
	  public void doPost (HttpServletRequest request,
	    HttpServletResponse response)
	    throws ServletException, IOException {
	      output(request, response);
	}

	private void output(HttpServletRequest request,
	    HttpServletResponse response)
	    throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	    out.println("<body bgcolor=\"#ffffff\">" +
	    "<center>" + "<hr> <br> &nbsp;" + "<h1>" +
	    "<font size=\"+3\" color=\"#CC0066\">Duke's </font>" +
	    "<img src=\"" + request.getContextPath() +
	    "/duke.books.gif\">" + 
	    "<font size=\"+3\" color=\"black\">Bookstore</font>" +
	    "</h1>" + "</center>" + "<br> &nbsp; <hr> <br> ");
	  }
	} 
