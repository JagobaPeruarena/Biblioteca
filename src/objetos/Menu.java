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

	public static final int HACER_PRESTAMO = 1;
	public static final int VER_PRESTAMOS_NO_DEVUELTOS = 2;
	public static final int PRESTAMOS_SOCIO = 3;
	public static final int DEVOLVER_LIBRO = 4;
	public static final int DISPONIBILIDAD_LIBRO= 5;

	public static void menuPrincipal() {

		System.out.println("------MENU-------");
		System.out.println(GESTIONAR_LIBROS + ". Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");

	}

	public static void menuLibros() {

		
		System.out.println(VER_LIBRO + ". Ver libro");
		System.out.println(INSERTAR_LIBRO + ". Insertar libro");
		System.out.println(ELIMINAR_LIBRO + ". Eliminar libro");
		System.out.println(MODIFICAR_LIBRO + ". Modificar libro");
		System.out.println(SALIR + ". Salir");

	}

	public static void menuSocios() {
	
		System.out.println(VER_SOCIO + ". Ver Socio");
		System.out.println(INSERTAR_SOCIO + ". Insertar socio");
		System.out.println(ELIMINAR_SOCIO + ". Eliminar socio");
		System.out.println(MODIFICAR_SOCIO + ". Modificar socio");
		System.out.println(SALIR + ". Salir");
	}

	public static void menuPrestamos() {
		
		System.out.println(HACER_PRESTAMO + ". Hacer un prestamo");
		System.out.println(VER_PRESTAMOS_NO_DEVUELTOS + ". Ver prestamos sin devolver");
		System.out.println(PRESTAMOS_SOCIO + ". Ver prestamos de un socio");
		System.out.println(DEVOLVER_LIBRO + ". Devolver un libro");
		System.out.println(DISPONIBILIDAD_LIBRO + ". Ver disponibilidad de un libro");
		System.out.println(SALIR + ". Salir");
	}
}
