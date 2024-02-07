package main;

import java.util.Scanner;

import gestores.GestorLibros;
import gestores.GestorPrestamos;
import gestores.GestorSocios;
import objetos.Menu;
import objetos.Visor;

public class GestorBiblioteca {
	private static Scanner scan = new Scanner(System.in);

	public static void run() {
		int opcionPrincipal = 1;
		do {
			Menu.menuPrincipal();
			opcionPrincipal = Integer.parseInt(scan.nextLine());
			switch (opcionPrincipal) {
			case Menu.GESTIONAR_LIBROS:
				Visor.mostrarMensaje("Menu libros seleccionada\n");
				GestorLibros.run(scan);

				break;

			case Menu.GESTIONAR_PRESTAMOS:
				Visor.mostrarMensaje("Menu Prestamos seleccionada\n");

				GestorPrestamos.run(scan);

				break;
			case Menu.GESTIONAR_SOCIOS:
				Visor.mostrarMensaje("Menu Socios seleccionada\n");
				GestorSocios.run(scan);

				break;
			}
		} while (opcionPrincipal != 0);
		
	}

}
