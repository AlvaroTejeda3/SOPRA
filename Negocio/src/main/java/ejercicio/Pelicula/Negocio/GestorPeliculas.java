package ejercicio.Pelicula.Negocio;

import java.util.List;

import ejercicio.Pelicula.Dao.IPeliculaDao;
import ejercicio.Pelicula.Modelo.ModeloPelicula;

public class GestorPeliculas {
	
	private IPeliculaDao DAOPeliculas;
	
	public void altaPelicula(List<ModeloPelicula> alta){
		for(int i=0;i<alta.size();i++){
			DAOPeliculas.crearPelicula(alta.get(i));
		}
		
	}
	
	public List<ModeloPelicula> listaPeliculas(){
		
		return DAOPeliculas.readPeliculas();
			
	}
	
	
	public void updatePeliculas(List<ModeloPelicula> update){
		for(int i=0;i<update.size();i++){
			DAOPeliculas.updatePelicula(update.get(i));
		}
	}
	
	
	public void deletePelicula(List<String> titulos){
		for(int i=0;i<titulos.size();i++){
			String titulo = titulos.get(i);
			ModeloPelicula pelicula = DAOPeliculas.readById(titulo);
			DAOPeliculas.deletePelicula(pelicula);
		}
		
		
	}
	

}
