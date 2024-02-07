package objetos;

import java.util.Date;

public class Prestamo {
	private boolean devuelto;
	private Date fecha;
	private int id_libro;
	private int id_socio;
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
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public Prestamo(boolean devuelto, Date fecha, int id_libro, int id_socio) {
		super();
		this.devuelto = devuelto;
		this.fecha = fecha;
		this.id_libro = id_libro;
		this.id_socio = id_socio;
	}
	public Prestamo() {}
}
