package gestores;

import java.util.Scanner;

import objetos.Libro;
import objetos.Menu;
import objetos.Visor;

public class GestorLibros {

	public static void run(Scanner scan) {
		int opcionLibro = 1;
		GestorBBDD gestor = new GestorBBDD();
		do {
			Menu.menuLibros();
			opcionLibro = Integer.parseInt(scan.nextLine());
			switch (opcionLibro) {
			case Menu.VER_LIBRO:
				Visor.mostrarLibros(gestor.getLibros());
				break;

			case Menu.INSERTAR_LIBRO:

				break;
			case Menu.ELIMINAR_LIBRO:

				break;
			case Menu.MODIFICAR_LIBRO:
				break;
			}
		} while (opcionLibro != 0);
	}

}
