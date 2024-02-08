package gestores;

import java.util.Scanner;

import objetos.Libro;
import objetos.Menu;
import objetos.Visor;

public class GestorLibros {

	public static void run(Scanner scan) {
		int opcionLibro = 1;
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.menuLibros();
			opcionLibro = Integer.parseInt(scan.nextLine());
			switch (opcionLibro) {
			case Menu.VER_LIBRO:
				Visor.mostrarLibros(gestorBBDD.getLibros());
				break;

			case Menu.INSERTAR_LIBRO:
				gestorBBDD.insertarLibro(FormularioDeDatos.pedirDatosLibro(scan));
								
				break;
			case Menu.ELIMINAR_LIBRO:
				gestorBBDD.eliminarLibro(FormularioDeDatos.pedirIdLibro(scan));

				break;
			case Menu.MODIFICAR_LIBRO:
				gestorBBDD.modificarLibro(FormularioDeDatos.modificarDatosLibro(gestorBBDD.getLibroId(FormularioDeDatos.pedirIdLibro(scan)), scan));
				break;
			}
		} while (opcionLibro != 0);
	}

}
