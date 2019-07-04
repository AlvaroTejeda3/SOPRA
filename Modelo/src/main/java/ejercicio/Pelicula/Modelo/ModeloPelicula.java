package ejercicio.Pelicula.Modelo;

public class ModeloPelicula {
	

	private String titulo;
	private String director;
	private String sinopsis;
	
	public ModeloPelicula(String titulo, String director, String sinopsis) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.sinopsis = sinopsis;
	}
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	


}
