package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
	protected Connection cn;
	
	public Conectar() {
		
		try {
			Class.forName("com.mysql.jbc.Driver");
			String url = "jbc:mysql://localhost/biblioteca";
			cn = (Connection) DriverManager.getConnection(url,"root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void cerrarConexionBBDD() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return cn;
	}

	public void setCon(Connection cn) {
		this.cn = cn;
	}
}
