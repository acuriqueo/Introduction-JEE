package cl.duoc.crud.bean;

import cl.duoc.crud.dao.IUserDAO;
import cl.duoc.crud.dao.impl.UserDAO;

public class UserBean {

	private IUserDAO userDAO =  new UserDAO();
	
	public String userSaludo(){
		return userDAO.saludar();
	}
	
	
}
