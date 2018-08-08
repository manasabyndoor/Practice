package com.book.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.pojo.Book;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;


@WebServlet("*.app")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService service = new BookServiceImpl();
		String action=request.getServletPath();
		Book book=new Book();
		request.setAttribute("Book", book);
		
			book.setBookName("manasa");
			book.setId(101);
			response.sendRedirect("addedtocart.jsp");
			request.setAttribute("Book",book);
			RequestDispatcher requestdispatcher=request.getRequestDispatcher(".jsp");
			requestdispatcher.forward(request, response);
		
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
