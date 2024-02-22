package gestores;

import java.util.Comparator;

import objetos.Prestamo;

public class OrdenarPorNombre implements Comparator<Prestamo> {

	@Override
	public int compare(Prestamo o1, Prestamo o2) {
		return o1.getLibro().getTitulo().compareTo(o2.getLibro().getTitulo());
		
	}
}
