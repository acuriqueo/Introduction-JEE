package cl.duoc.controlusuarios.dao;

import java.util.List;

import cl.duoc.controlusuarios.to.UsuarioTO;

public interface IUsuarioDAO {
	
	public UsuarioTO getUsuarioByEmailAndPass(String email);
	
	public List<UsuarioTO> getAllUsers();
	
	public void addUsuario(UsuarioTO usuarioTO);
	
}
