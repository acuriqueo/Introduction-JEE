package cl.duoc.crud.dao.impl;

import cl.duoc.crud.dao.IUserDAO;
import cl.duoc.crud.to.UserTO;

public class UserDAO implements IUserDAO{

	@Override
	public String saludar() {
		String saludo;
		saludo = "Esto es un saludo desde el DAO";
		return saludo;
	}
	
	public UserTO getUsuario(){
		UserTO user = new UserTO();
		user.setName("carlos");
		user.setEdad(21);
		return user;
	}

}
