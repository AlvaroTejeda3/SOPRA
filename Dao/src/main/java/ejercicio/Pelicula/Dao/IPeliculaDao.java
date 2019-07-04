package ejercicio.Pelicula.Dao;

import java.util.List;

import ejercicio.Pelicula.Modelo.ModeloPelicula;

public interface IPeliculaDao {
	
	ModeloPelicula crearPelicula(ModeloPelicula pelicula);
	List<ModeloPelicula> readPeliculas();
	ModeloPelicula deletePelicula(ModeloPelicula pelicula);
	ModeloPelicula updatePelicula(ModeloPelicula pelicula);
	ModeloPelicula readById(String titulo);
	
	

}
