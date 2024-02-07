package gestores;

import java.util.Scanner;

import objetos.Menu;

public class GestorSocios {

	public static void run(Scanner scan) {
		int opcionSocio = 1;
		do {
			Menu.menuSocios();
			opcionSocio = Integer.parseInt(scan.nextLine());
			switch (opcionSocio) {
			case Menu.VER_SOCIO:

				break;

			case Menu.INSERTAR_SOCIO:

				break;
			case Menu.ELIMINAR_SOCIO:

				break;
			case Menu.MODIFICAR_SOCIO:
				break;
			}
		} while (opcionSocio != 0);
	}
}
