package gestores;

import java.util.Scanner;

import objetos.Libro;
import objetos.Socio;
import objetos.Visor;

public class FormularioDeDatos {

	public static Libro pedirDatosLibro(Scanner scan) {
		Libro newLibro = new Libro();
		Visor.mostrarMensaje("Di el titulo del libro");
		newLibro.setTitulo(scan.nextLine());
		Visor.mostrarMensaje("Di el autor del libro");
		newLibro.setAutor(scan.nextLine());
		Visor.mostrarMensaje("Di el numero de paginas del libro");
		newLibro.setNumPag(Integer.parseInt(scan.nextLine()));
		return newLibro;
		
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		Visor.mostrarMensaje("Este es el libro seleccionado:");
		Visor.mostrarLibro(libro);
		Visor.mostrarMensaje("Di el nuevo titulo del libro");
		libro.setTitulo(scan.nextLine());
		Visor.mostrarMensaje("Di el nuevo autor del libro");
		libro.setAutor(scan.nextLine());
		Visor.mostrarMensaje("Di el nuevo numero de paginas del libro");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		return libro;
	
	}
	
	public static int pedirIdLibro(Scanner scan) {
		Visor.mostrarMensaje("Di el la id del libro");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	public static Socio pedirDatosSocio(Scanner scan) {
		Socio newSocio = new Socio();
		Visor.mostrarMensaje("Di el nombre del socio");
		newSocio.setNombre(scan.nextLine());
		Visor.mostrarMensaje("Di el apellido del socio");
		newSocio.setApellido(scan.nextLine());
		Visor.mostrarMensaje("Di la direccion del socio");
		newSocio.setDireccion(scan.nextLine());
		Visor.mostrarMensaje("Di la poblacion del socio");
		newSocio.setPoblacion(scan.nextLine());
		Visor.mostrarMensaje("Di la provincia del socio");
		newSocio.setProvincia(scan.nextLine());
		Visor.mostrarMensaje("Di el dni del socio");
		newSocio.setDni(scan.nextLine());
		return newSocio;
		
	}
	
	public static Socio modificarDatosSocio(Socio socio, Scanner scan) {
		Visor.mostrarMensaje("Este es el socio seleccionado:");
		Visor.mostrarSocio(socio);
		Visor.mostrarMensaje("Di el nuevo nombre del socio");
		socio.setNombre(scan.nextLine());
		Visor.mostrarMensaje("Di el nuevo apellido del socio");
		socio.setApellido(scan.nextLine());
		Visor.mostrarMensaje("Di la nuevo direccion del socio");
		socio.setDireccion(scan.nextLine());
		Visor.mostrarMensaje("Di la nuevo poblacion del socio");
		socio.setPoblacion(scan.nextLine());
		Visor.mostrarMensaje("Di la nuevo provincia del socio");
		socio.setProvincia(scan.nextLine());
		Visor.mostrarMensaje("Di el nuevo dni del socio");
		socio.setDni(scan.nextLine());
		return socio;
	
	}
	
	public static int pedirIdSocio(Scanner scan) {
		Visor.mostrarMensaje("Di el la id del socio");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
}
