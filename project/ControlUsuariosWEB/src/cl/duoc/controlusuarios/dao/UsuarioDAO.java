package cl.duoc.controlusuarios.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

		} finally {

			close(con);
			close(ps);
			close(rs);

		}

		return usuario;
	}

	public List<UsuarioTO> getAllUsers() {

		List<UsuarioTO> usuarios = new ArrayList<UsuarioTO>();

		try {
			con = ConnectionDAO.getConnection();

			if (con != null) {

				String query = "select email, password from usuario order by email";
				ps = con.prepareStatement(query);				
				rs = ps.executeQuery();

				while (rs.next()) {
					UsuarioTO usuario = new UsuarioTO();
					usuario.setEmail(rs.getString("email"));
					usuario.setPassword(rs.getString("password"));
					usuarios.add(usuario);
				}

			}
		} catch (SQLException sqlEx) {

			sqlEx.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			close(con);
			close(ps);
			close(rs);

		}

		return usuarios;
	}

	
	public void addUsuario(UsuarioTO usuarioTO) {		

		try {
			con = ConnectionDAO.getConnection();

			if (con != null) {

				String query = "insert into usuario(email,password) values (?,?)";
				ps = con.prepareStatement(query);
				ps.setString(1, usuarioTO.getEmail());
				ps.setString(2, usuarioTO.getPassword());
				ps.execute();				

			}
		} catch (SQLException sqlEx) {

			sqlEx.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			close(con);
			close(ps);
			close(rs);

		}		
		
	}

}
