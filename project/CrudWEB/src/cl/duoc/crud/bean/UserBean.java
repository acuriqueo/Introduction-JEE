package cl.duoc.crud.bean;

import cl.duoc.crud.dao.IUserDAO;
import cl.duoc.crud.dao.impl.UserDAO;
import cl.duoc.crud.to.UserTO;

public class UserBean implements IUserBean{

	private IUserDAO userDAO =  new UserDAO();
	
	public String userSaludo(){
		return userDAO.saludar();
	}
	
	public UserTO getMyUser(){
		return userDAO.getUsuario();
	}
	
}
