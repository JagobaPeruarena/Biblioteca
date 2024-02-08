package gestores;

import java.util.Scanner;

import objetos.Libro;
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
	
}
