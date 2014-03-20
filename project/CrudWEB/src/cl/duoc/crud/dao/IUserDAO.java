package cl.duoc.crud.dao;

import cl.duoc.crud.to.UserTO;

public interface IUserDAO {
	
	String saludar();
	
	UserTO getUsuario();

}
