package objetos;

import java.util.Date;

public class Prestamo {
	private boolean devuelto;
	private Date fecha;
	private Libro libro;
	private Socio socio;
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
	public Prestamo(boolean devuelto, Date fecha, Libro libro, Socio socio) {
		super();
		this.devuelto = devuelto;
		this.fecha = fecha;
		this.libro = libro;
		this.socio = socio;
	}
	public Prestamo() {}
	@Override
	public String toString() {
		return "Prestamo: "+libro.toString()+"\n-"+socio.toString()+"\n fecha:"+fecha+" Devuelto:"+devuelto;
	}
	
}
