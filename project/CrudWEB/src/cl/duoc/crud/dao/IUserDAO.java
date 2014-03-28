package cl.duoc.crud.dao;

import java.util.List;

import cl.duoc.crud.to.UserTO;

public interface IUserDAO {
	
	String saludar();
	
	UserTO getUsuario();
	
	List<UserTO> getUsers();

}
