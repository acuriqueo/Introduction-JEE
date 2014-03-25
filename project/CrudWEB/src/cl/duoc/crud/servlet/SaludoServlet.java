package cl.duoc.crud.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.duoc.crud.bean.IUserBean;
import cl.duoc.crud.bean.UserBean;


public class SaludoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public SaludoServlet() {
        super();    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/saludo.jsp");		
	
		IUserBean userBean = new UserBean();
												
		request.setAttribute("saludo", userBean.userSaludo());
		
		dispatcher.forward(request,response);				
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
