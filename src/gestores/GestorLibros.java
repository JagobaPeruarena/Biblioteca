package gestores;

import java.util.Scanner;

import objetos.Menu;

public class GestorLibros {

	public static void run(Scanner scan) {
		int opcionLibro = 1;
		do {
			Menu.menuLibros();
			opcionLibro = Integer.parseInt(scan.nextLine());
			switch (opcionLibro) {
			case Menu.VER_LIBRO:

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
