package ejercicio.Pelicula.Dao;

import java.util.List;

import ejercicio.Pelicula.Modelo.ModeloPelicula;

public class PeliculasDaoMemoryImplementacion implements IPeliculaDao {

	private List<ModeloPelicula> peliculas;
	
	
	
	public ModeloPelicula crearPelicula(ModeloPelicula pelicula) {
		
		peliculas.add(pelicula);
		
		return null;
	}

	public List<ModeloPelicula> readPeliculas() {
		
		
		return peliculas;
	}

	public ModeloPelicula deletePelicula(ModeloPelicula pelicula) {
		
		peliculas.remove(pelicula);
	
		return null;
	}

	public ModeloPelicula updatePelicula(ModeloPelicula pelicula) {
		
		if(peliculas.contains(pelicula)) {
			peliculas.remove(pelicula);
			peliculas.add(pelicula);
		}
		
		return null;
	}

	public ModeloPelicula readById(String titulo) {
		
		for(int i=0; i<peliculas.size();i++) {
			ModeloPelicula pelicula = peliculas.get(i);
			if(titulo.equals(pelicula.getTitulo())) {
				return pelicula;
			}
		}
		
		return null;
	}

	
	
	


}
