package ejercicio.Pelicula.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ejercicio.Pelicula.Modelo.ModeloPelicula;

@Component
public class PeliculasDaoMemoryImplementacion implements IPeliculaDao {

	@Autowired
	@Qualifier("almacenPeliculas")
	private List<ModeloPelicula> peliculas;

	public List<ModeloPelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<ModeloPelicula> peliculas) {
		this.peliculas = peliculas;
	}

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

		if (peliculas.contains(pelicula)) {
			peliculas.remove(pelicula);
			peliculas.add(pelicula);
		}

		return null;
	}

	public ModeloPelicula readById(String titulo) {

		for (int i = 0; i < peliculas.size(); i++) {
			ModeloPelicula pelicula = peliculas.get(i);
			if (titulo.equals(pelicula.getTitulo())) {
				return pelicula;
			}
		}

		return null;
	}

}
