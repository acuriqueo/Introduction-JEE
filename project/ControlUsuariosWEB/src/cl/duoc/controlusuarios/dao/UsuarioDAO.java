package cl.duoc.controlusuarios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.duoc.controlusuarios.ConnectionDAO;
import cl.duoc.controlusuarios.to.UsuarioTO;

public class UsuarioDAO extends GenericDAO implements IUsuarioDAO {

	

	public UsuarioTO getUsuarioByEmailAndPass(String email) {
		UsuarioTO usuario = null;

		try {
			con = ConnectionDAO.getConnection();

			if (con != null) {

				String query = "select email, password from usuario where email = ?";
				ps = con.prepareStatement(query);
				ps.setString(0, email);
				rs = ps.executeQuery();

				while (rs.next()) {
					usuario = new UsuarioTO();
					usuario.setEmail(rs.getString("email"));
					usuario.setPassword(rs.getString("password"));
				}

			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
}
