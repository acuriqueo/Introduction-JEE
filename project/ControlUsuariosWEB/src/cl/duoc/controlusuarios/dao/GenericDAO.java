package cl.duoc.controlusuarios.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GenericDAO {
	
	protected Connection con = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	protected void closeAll(){
		close(con);
		close(ps);
		close(rs);
	}
	
	protected void close(Closeable c){
		try{
			if(c!=null){
				c.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}

