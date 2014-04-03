package cl.duoc.controlusuarios.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.duoc.controlusuarios.bean.IUsuarioBean;
import cl.duoc.controlusuarios.bean.UsuarioBean;
import cl.duoc.controlusuarios.to.UsuarioTO;

public class AddUsuarioServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private IUsuarioBean usuarioBean = new UsuarioBean();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher  dispatcher = request.getRequestDispatcher("/pages/main/message.jsp");
		
		UsuarioTO usuarioTO = new UsuarioTO();
		
		usuarioTO.setEmail(request.getParameter("email"));
		usuarioTO.setPassword(request.getParameter("password"));			
		
		usuarioBean.addUser(usuarioTO);					
		
		request.setAttribute("message", "El usuario fue creado");		
		
		dispatcher.forward(request, response);
	}
}
