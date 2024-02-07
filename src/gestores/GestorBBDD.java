package gestores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.Conectar;
import objetos.Libro;

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

	public Libro getLibro(int id) {
		String query = "SELECT * FROM indicadores WHERE id = ?";
		try (PreparedStatement st = getCon().prepareStatement(query)) {
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setAutor(rs.getString("autor"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setNumPag(rs.getInt("num_pag"));

				return libro;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
