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
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModeloPelicula other = (ModeloPelicula) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ModeloPelicula [titulo=" + titulo + ", director=" + director + ", sinopsis=" + sinopsis + "]";
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
