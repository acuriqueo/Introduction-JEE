package cl.duoc.crud.bean;

import cl.duoc.crud.to.CalculadoraTO;

public class CalculadoraBean implements ICalculadoraBean {

	public Integer calcular(CalculadoraTO calculadoraTO) {
		Integer resultado = new Integer(0);
		switch (calculadoraTO.getOperacion()) {
		case 1: //suma
			resultado = calculadoraTO.getDato1() + calculadoraTO.getDato2();
			break;
		case 2://resta
			resultado = calculadoraTO.getDato1() - calculadoraTO.getDato2();
			break;
		case 3://multiplicacion
			resultado = calculadoraTO.getDato1() * calculadoraTO.getDato2();
			break;
		case 4://division
			resultado = calculadoraTO.getDato1() / calculadoraTO.getDato2();
			break;

		}
		return resultado;
	}

}
