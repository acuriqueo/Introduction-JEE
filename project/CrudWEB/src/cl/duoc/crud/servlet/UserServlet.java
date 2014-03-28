package cl.duoc.crud.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.duoc.crud.bean.IUserBean;
import cl.duoc.crud.bean.UserBean;


public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public UserServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserBean userBean = new UserBean();		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/user.jsp");
		request.setAttribute("user", userBean.getMyUser());
		request.setAttribute("users", userBean.getUsers());		
		dispatcher.forward(request, response);		
		
	}
		
}
