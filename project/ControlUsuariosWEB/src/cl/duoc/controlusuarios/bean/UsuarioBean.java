package cl.duoc.controlusuarios.bean;

import java.util.List;

import cl.duoc.controlusuarios.dao.IUsuarioDAO;
import cl.duoc.controlusuarios.dao.UsuarioDAO;
import cl.duoc.controlusuarios.to.UsuarioTO;


public class UsuarioBean implements IUsuarioBean {

	private IUsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public UsuarioTO getUsuario(String email) {
		return usuarioDAO.getUsuarioByEmailAndPass(email);
	}
	
	public List<UsuarioTO> getAllUsuarios() {
		
		return usuarioDAO.getAllUsers();
		
	}
	
	public void addUser(UsuarioTO usuarioTO) {
		usuarioDAO.addUsuario(usuarioTO);		
	}

}
