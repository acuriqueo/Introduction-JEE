package cl.duoc.crud.bean;

import java.util.List;

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
	
	public List<UserTO> getUsers() {
		return userDAO.getUsers();
	}
	
}
