package gestores;

import java.util.Scanner;

import objetos.Menu;
import objetos.Visor;

public class GestorSocios {

	public static void run(Scanner scan) {
		int opcionSocio = 1;
		GestorBBDD gestorBBDD = new GestorBBDD();

		do {
			Menu.menuSocios();
			opcionSocio = Integer.parseInt(scan.nextLine());
			switch (opcionSocio) {
			case Menu.VER_SOCIO:
				Visor.mostrarSocios(gestorBBDD.getSocios());
				break;

			case Menu.INSERTAR_SOCIO:
				gestorBBDD.insertarSocio(FormularioDeDatos.pedirDatosSocio(scan));
				break;
			case Menu.ELIMINAR_SOCIO:
				gestorBBDD.eliminarSocio(FormularioDeDatos.pedirIdSocio(scan));
				break;
			case Menu.MODIFICAR_SOCIO:
				gestorBBDD.modificarSocio(FormularioDeDatos.modificarDatosSocio(gestorBBDD.getSocioId(FormularioDeDatos.pedirIdSocio(scan)), scan));
				break;
			}
		} while (opcionSocio != 0);
	}
}
