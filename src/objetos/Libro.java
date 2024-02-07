package objetos;

public class Libro {
	private String autor;
	private int id;
	private int numPag;
	private String titulo;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Libro(String autor, int id, int numPag, String titulo) {
		super();
		this.autor = autor;
		this.id = id;
		this.numPag = numPag;
		this.titulo = titulo;
	}
	
	
	@Override
	public String toString() {
		return "Libroº"+id+": "+titulo+ " del autor: "+autor+" con un total de: "+numPag+" paginas\n" ;
	}
	public Libro() {
		
	}
}
