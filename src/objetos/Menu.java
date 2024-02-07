package objetos;

public class Menu {
	public static final int SALIR = 0;

	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;

	public static final int VER_LIBRO = 1;
	public static final int INSERTAR_LIBRO = 2;
	public static final int ELIMINAR_LIBRO = 3;
	public static final int MODIFICAR_LIBRO = 4;

	public static final int VER_SOCIO = 1;
	public static final int INSERTAR_SOCIO = 2;
	public static final int ELIMINAR_SOCIO = 3;
	public static final int MODIFICAR_SOCIO = 4;

	public static final int VER_PRESTAMO = 1;
	public static final int INSERTAR_PRESTAMO = 2;
	public static final int ELIMINAR_PRESTAMO = 3;
	public static final int MODIFICAR_PRESTAMO = 4;

	public static void menuPrincipal() {

		System.out.println("------MENU-------");
		System.out.println(GESTIONAR_LIBROS + ". Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");

	}

	public static void menuLibros() {

		System.out.println("Menu libros seleccionada\n");
		System.out.println(VER_LIBRO + ". Ver libro");
		System.out.println(INSERTAR_LIBRO + ". Insertar libro");
		System.out.println(ELIMINAR_LIBRO + ". Eliminar libro");
		System.out.println(MODIFICAR_LIBRO + ". Modificar libro");
		System.out.println(SALIR + ". Salir");

	}

	public static void menuSocios() {
		System.out.println("Menu Socios seleccionada\n");
		System.out.println(VER_SOCIO + ". Ver Socio");
		System.out.println(INSERTAR_SOCIO + ". Insertar socio");
		System.out.println(ELIMINAR_SOCIO + ". Eliminar socio");
		System.out.println(MODIFICAR_SOCIO + ". Modificar socio");
		System.out.println(SALIR + ". Salir");
	}

	public static void menuPrestamos() {
		System.out.println("Menu Prestamos seleccionada\n");
		System.out.println(VER_PRESTAMO + ". Ver prestamo");
		System.out.println(INSERTAR_PRESTAMO + ". Insertar prestamo");
		System.out.println(ELIMINAR_PRESTAMO + ". Eliminar prestamo");
		System.out.println(MODIFICAR_PRESTAMO + ". Modificar prestamo");
		System.out.println(SALIR + ". Salir");
	}
}
