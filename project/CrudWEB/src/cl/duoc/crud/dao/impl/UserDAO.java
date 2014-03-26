package cl.duoc.crud.dao.impl;

import java.util.ArrayList;
import java.util.List;

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

	
	public List<UserTO> getUsers() {
		List<UserTO> users = new ArrayList<UserTO>();
		UserTO userTO = new UserTO();
		
		userTO.setName("carlos");
		userTO.setEdad(27);
		
		users.add(userTO);
		
		userTO = new UserTO();
		
		userTO.setName("jose");
		userTO.setEdad(99);
		
		users.add(userTO);
		
		userTO = new UserTO();
		
		userTO.setName("pedro");
		userTO.setEdad(null);
		
		users.add(userTO);
		
		userTO = new UserTO();
		userTO.setName("marcelo");
		userTO.setEdad(100);
				
		users.add(userTO);
		
		return users;
		
	}

}
