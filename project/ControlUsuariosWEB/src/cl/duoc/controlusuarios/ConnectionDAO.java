package cl.duoc.controlusuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/usuariodb",
							"duoc", "duoc1234");
		} catch (ClassNotFoundException classException) {
			classException.printStackTrace();
			con = null;
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
			con = null;
		}

		return con;
	}
	
	public static void closeConnection(Connection conn){
		try{
			conn.close();
		}catch(SQLException sqlEX){
			sqlEX.printStackTrace();
		}
	}
}
