package cl.duoc.crud.bean;

import java.util.List;

import cl.duoc.crud.to.UserTO;

public interface IUserBean {
	
	public String userSaludo();
	
	public UserTO getMyUser();
	
	public List<UserTO> getUsers();
	
}
