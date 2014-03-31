package cl.duoc.controlusuarios.dao;

import cl.duoc.controlusuarios.to.UsuarioTO;

public interface IUsuarioDAO {
	
	public UsuarioTO getUsuarioByEmailAndPass(String email);
	
}
