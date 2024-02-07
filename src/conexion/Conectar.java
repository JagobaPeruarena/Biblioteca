package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
	protected Connection cn;
	
	public Conectar() {
		
		try {

			final String HOST = "localhost";
			final String USERNAME = "root";
			final String PASSWORD = "";
			final String BBDD = "biblioteca";

			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			System.out.println("Conexion establecida");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
