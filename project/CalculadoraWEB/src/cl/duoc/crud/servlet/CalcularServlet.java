package cl.duoc.crud.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.duoc.crud.bean.CalculadoraBean;
import cl.duoc.crud.bean.ICalculadoraBean;
import cl.duoc.crud.to.CalculadoraTO;

public class CalcularServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/calculadora/resultado.jsp");
		Integer dato1 = Integer.parseInt(request.getParameter("dato1"));
		Integer dato2 = Integer.parseInt(request.getParameter("dato2"));
		Integer op = Integer.parseInt(request.getParameter("op"));

		CalculadoraTO calculadoraTO = new CalculadoraTO();
		calculadoraTO.setDato1(dato1);
		calculadoraTO.setDato2(dato2);
		calculadoraTO.setOperacion(op);

		ICalculadoraBean calculadoraBean = new CalculadoraBean();

		request.setAttribute("resultado", calculadoraBean.calcular(calculadoraTO));

		dispatcher.forward(request, response);

	}

}
