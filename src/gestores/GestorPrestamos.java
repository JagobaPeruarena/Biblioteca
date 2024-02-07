package gestores;

import java.util.Scanner;

import objetos.Menu;

public class GestorPrestamos {
	public static void run(Scanner scan) {
		int opcionPrestamo = 1;
		do {
			Menu.menuLibros();
			opcionPrestamo = Integer.parseInt(scan.nextLine());
			switch (opcionPrestamo) {
			case Menu.VER_PRESTAMO:

				break;

			case Menu.INSERTAR_PRESTAMO:

				break;
			case Menu.ELIMINAR_PRESTAMO:

				break;
			case Menu.MODIFICAR_PRESTAMO:
				break;
			}
		} while (opcionPrestamo != 0);
	}
}
