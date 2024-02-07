package main;

import java.util.Scanner;

import gestores.GestorLibros;
import gestores.GestorPrestamos;
import gestores.GestorSocios;
import objetos.Menu;

public class GestorBiblioteca {
	private static Scanner scan = new Scanner(System.in);

	public static void run() {
		int opcionPrincipal = 1;
		do {
			Menu.menuPrincipal();
			opcionPrincipal = Integer.parseInt(scan.nextLine());
			switch (opcionPrincipal) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);

				break;

			case Menu.GESTIONAR_PRESTAMOS:
				GestorPrestamos.run(scan);

				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);

				break;
			}
		} while (opcionPrincipal != 0);
		
	}

}
