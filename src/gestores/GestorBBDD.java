package gestores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conectar;
import objetos.Libro;
import objetos.Socio;

public class GestorBBDD extends Conectar {
	public void insertarLibro(Libro libro) {
		String query = "INSERT INTO libros (titulo, autor,num_pag) VALUES (?, ?, ?)";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setString(1, libro.getTitulo());
			st.setString(2, libro.getAutor());
			st.setInt(3, libro.getNumPag());

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarLibro(int idLibro) {
		String query = "DELETE FROM libros WHERE id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setInt(1, idLibro);

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Libro> getLibros() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		String query = "SELECT * FROM libros";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setAutor(rs.getString("autor"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setNumPag(rs.getInt("num_pag"));
				libros.add(libro);
				
			}
			return libros;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public Libro getLibroId(int id) {
		String query = "SELECT * FROM libros WHERE id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			

	        if (rs.next()) {
			
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setAutor(rs.getString("autor"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setNumPag(rs.getInt("num_pag"));

				rs.close();
	            st.close();
	            return libro;
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public void modificarLibro(Libro libro) {
		String query = "UPDATE libros SET autor = ?, titulo = ? , num_pag = ? where id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setString(1, libro.getTitulo());
			st.setString(2, libro.getAutor());
			st.setInt(3, libro.getNumPag());
			st.setInt(4, libro.getId());

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}public void insertarSocio(Socio socio) {
		String query = "INSERT INTO socios (nombre,apellido,direccion,poblacion,provincia,dni) VALUES (?, ?, ?,?,?,?)";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setString(1, socio.getNombre());
			st.setString(2, socio.getApellido());
			st.setString(3, socio.getDireccion());
			st.setString(4, socio.getPoblacion());
			st.setString(5, socio.getProvincia());
			st.setString(6, socio.getDni());
			
			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarSocio(int idSocio) {
		String query = "DELETE FROM socios WHERE id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setInt(1, idSocio);

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Socio> getSocios() {
		ArrayList<Socio> socios = new ArrayList<Socio>();
		String query = "SELECT * FROM socios";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Socio socio = new Socio();
				socio.setId(rs.getInt("id"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apellido"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				socio.setDni(rs.getString("dni"));
				socios.add(socio);
				
			}
			return socios;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public Socio getSocioId(int id) {
		String query = "SELECT * FROM socios WHERE id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			

	        if (rs.next()) {
			
				Socio socio = new Socio();
				socio.setId(rs.getInt("id"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apellido"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				socio.setDni(rs.getString("dni"));
				

				rs.close();
	            st.close();
	            return socio;
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public void modificarSocio (Socio socio) {
		String query = "UPDATE socios SET nombre = ?, apellido = ? , direccion = ?, poblacion=?,provincia=?,dni=?  where id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setString(1, socio.getNombre());
			st.setString(2, socio.getApellido());
			st.setString(3, socio.getDireccion());
			st.setString(4, socio.getPoblacion());
			st.setString(5, socio.getProvincia());
			st.setString(6, socio.getDni());
			st.setInt(7, socio.getId());

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
