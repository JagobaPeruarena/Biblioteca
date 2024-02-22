package gestores;

import java.util.Scanner;

import objetos.Menu;
import objetos.Visor;

public class GestorPrestamos {
	public static void run(Scanner scan) {
		int opcionPrestamo = 1;
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.menuPrestamos();
			opcionPrestamo = Integer.parseInt(scan.nextLine());
			switch (opcionPrestamo) {
			case Menu.HACER_PRESTAMO:
				gestorBBDD.insertarPrestamo(FormularioDeDatos.pedirDatosPrestamo(scan));
				break;

			case Menu.VER_PRESTAMOS_NO_DEVUELTOS:
				Visor.mostrarPrestamos(gestorBBDD.getPrestamosNoDevueltos());
				break;
			case Menu.PRESTAMOS_SOCIO:
				Visor.mostrarPrestamos(gestorBBDD.getPrestamosDeSocio(FormularioDeDatos.pedirIdSocio(scan)));
				break;
			
			case Menu.DEVOLVER_LIBRO:
				gestorBBDD.modificarPrestamo(gestorBBDD.getPrestamo(FormularioDeDatos.pedirIdLibro(scan), FormularioDeDatos.pedirIdSocio(scan)));
				break;
			case Menu.DISPONIBILIDAD_LIBRO:
				if (gestorBBDD.disponibilidadLibro(FormularioDeDatos.pedirIdLibro(scan))) {
					Visor.mostrarMensaje("El libro seleccionado esta disponible");
				}else {
					Visor.mostrarMensaje("El libro no esta disponible");
				}
				break;
			}
		} while (opcionPrestamo != 0);
	}
}
