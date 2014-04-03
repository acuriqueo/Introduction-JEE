package cl.duoc.controlusuarios.bean;

import java.util.List;

import cl.duoc.controlusuarios.to.UsuarioTO;

public interface IUsuarioBean {

	public UsuarioTO getUsuario(String email);
	
	public List<UsuarioTO> getAllUsuarios();
	
	public void addUser(UsuarioTO usuarioTO);
	
}
