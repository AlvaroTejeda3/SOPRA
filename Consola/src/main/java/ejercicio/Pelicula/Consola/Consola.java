package ejercicio.Pelicula.Consola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ejercicio.Pelicula.Modelo.ModeloPelicula;
import ejercicio.Pelicula.Negocio.GestorPeliculas;

public class Consola {
    public static void main( String[] args )
    {
    	GestorPeliculas gestor = new GestorPeliculas();
    	ModeloPelicula pelicula1 = new ModeloPelicula("Titulo1","Director1", null);
    	ModeloPelicula pelicula2 = new ModeloPelicula("Titulo2","Director2", null);	
    	ModeloPelicula pelicula3 = new ModeloPelicula("Titulo3","Director3", null);	
    	ModeloPelicula pelicula4 = new ModeloPelicula("Titulo4","Director4", null);	
    	ModeloPelicula pelicula5 = new ModeloPelicula("Titulo5","Director5", null);	
    	
    	
    	List<ModeloPelicula> miListaDePeliculas = new ArrayList<>();
    	miListaDePeliculas.add(pelicula1);
    	miListaDePeliculas.add(pelicula2);
    	miListaDePeliculas.add(pelicula3);
    	miListaDePeliculas.add(pelicula4);
    	miListaDePeliculas.add(pelicula5);
    	
    	
    	gestor.altaPelicula(miListaDePeliculas);
    	System.out.println(gestor.listaPeliculas());
    	
    	System.out.println("--------------------------------------------");
    	
    	ModeloPelicula peliculaModificada2 = new ModeloPelicula("Titulo2","Manolete", null);		
    	ModeloPelicula peliculaModificiada6 = new ModeloPelicula("Titulo5","Juanillo", null);
    	
    	List<ModeloPelicula> miListaDePeliculasModificada = new ArrayList<>();
    	
    	miListaDePeliculasModificada.add(peliculaModificada2);
    	miListaDePeliculasModificada.add(peliculaModificiada6);
    	
    	gestor.updatePeliculas(miListaDePeliculasModificada);
    	System.out.println(gestor.listaPeliculas());
    	
    	System.out.println("--------------------------------------------");
    	
    	gestor.deletePelicula(Arrays.asList("Titulo2","Titulo1"));
    	
    	
        System.out.println(gestor.listaPeliculas());
    	
    	System.out.println("----FIN----");
    	
  
    	
    	
    	
    	
    		
    		
    	
    	
    }
}
