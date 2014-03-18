package cl.duoc.crud.dao.impl;

import cl.duoc.crud.dao.IUserDAO;

public class UserDAO implements IUserDAO{

	@Override
	public String saludar() {
		String saludo;
		saludo = "Esto es un saludo desde el DAO";
		return saludo;
	}

}
