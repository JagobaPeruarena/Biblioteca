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
	
}
