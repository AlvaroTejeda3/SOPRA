package ejercicio.Pelicula.Negocio;

import java.util.ArrayList;

import ejercicio.Pelicula.Dao.PeliculasDaoMemoryImplementacion;
import ejercicio.Pelicula.Modelo.ModeloPelicula;

public class Factory {

	private static GestorPeliculas gestor;

	public static GestorPeliculas getDao() {

		if (gestor == null) {

			gestor = new GestorPeliculas();

			PeliculasDaoMemoryImplementacion peliDao = new PeliculasDaoMemoryImplementacion();
			peliDao.setPeliculas(new ArrayList<ModeloPelicula>());
			gestor.setDaoPeliculas(peliDao);
		}

		return gestor;
	}

}
