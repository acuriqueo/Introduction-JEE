package cl.duoc.controlusuarios.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.duoc.controlusuarios.bean.IUsuarioBean;
import cl.duoc.controlusuarios.bean.UsuarioBean;
import cl.duoc.controlusuarios.to.UsuarioTO;

public class MainServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private IUsuarioBean usuarioBean = new UsuarioBean();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher  dispatcher = request.getRequestDispatcher("/pages/main/main.jsp");
			
		List<UsuarioTO> users =  usuarioBean.getAllUsuarios();	
		
		request.setAttribute("usuarios", users);
		
		dispatcher.forward(request, response);
	}

}
