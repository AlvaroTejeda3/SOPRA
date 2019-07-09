package ejercicio.Pelicula.Negocio;

import java.util.List;

import ejercicio.Pelicula.Dao.IPeliculaDao;
import ejercicio.Pelicula.Dao.PeliculasDaoMemoryImplementacion;
import ejercicio.Pelicula.Modelo.ModeloPelicula;


public class GestorPeliculasConAnotaciones {

	private IPeliculaDao daoPeliculas;
	
	

	public IPeliculaDao getDaoPeliculas() {
		return daoPeliculas;
	}

	public void setDaoPeliculas(IPeliculaDao daoPeliculas) {
		this.daoPeliculas = daoPeliculas;
	}

	public void altaPelicula(List<ModeloPelicula> alta) {
		for (int i = 0; i < alta.size(); i++) {
			daoPeliculas.crearPelicula(alta.get(i));
		}

	}

	public List<ModeloPelicula> listaPeliculas() {

		return daoPeliculas.readPeliculas();

	}

	public void updatePeliculas(List<ModeloPelicula> update) {

		for (int i = 0; i < daoPeliculas.readPeliculas().size(); i++) {

			for (int j = 0; j < update.size(); j++) {

				if (update.get(j).getTitulo().equals(daoPeliculas.readPeliculas().get(i).getTitulo())) {
					
					daoPeliculas.updatePelicula(update.get(j));

				}

			}
		}
	}

	public void deletePelicula(List<String> titulos) {
		for (int i = 0; i < titulos.size(); i++) {
			String titulo = titulos.get(i);
			ModeloPelicula pelicula = daoPeliculas.readById(titulo);
			daoPeliculas.deletePelicula(pelicula);
		}

	}

}
