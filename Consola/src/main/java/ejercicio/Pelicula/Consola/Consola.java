package ejercicio.Pelicula.Consola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejercicio.Pelicula.Modelo.ModeloPelicula;
import ejercicio.Pelicula.Negocio.GestorPeliculas;

public class Consola {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		ModeloPelicula pelicula1 = context.getBean("Pelicula", ModeloPelicula.class);
		pelicula1.setTitulo("AmericanPie1");
		pelicula1.setDirector("Giusseppe1");
		ModeloPelicula pelicula2 = context.getBean("Pelicula", ModeloPelicula.class);
		pelicula2.setTitulo("AmericanPie2");
		pelicula2.setDirector("Giusseppe2");
		ModeloPelicula pelicula3 = context.getBean("Pelicula", ModeloPelicula.class);
		pelicula3.setTitulo("AmericanPie3");
		pelicula3.setDirector("Giusseppe3");
		ModeloPelicula pelicula4 = context.getBean("Pelicula", ModeloPelicula.class);
		pelicula4.setTitulo("AmericanPie4");
		pelicula4.setDirector("Giusseppe4");
		ModeloPelicula pelicula5 = context.getBean("Pelicula", ModeloPelicula.class);
		pelicula5.setTitulo("AmericanPie5");
		pelicula5.setDirector("Giusseppe5");

		GestorPeliculas gestor = context.getBean("Gestion", GestorPeliculas.class);

		List<ModeloPelicula> miListaDePeliculas = new ArrayList<>();
		miListaDePeliculas.add(pelicula1);
		miListaDePeliculas.add(pelicula2);
		miListaDePeliculas.add(pelicula3);
		miListaDePeliculas.add(pelicula4);
		miListaDePeliculas.add(pelicula5);

		gestor.altaPelicula(miListaDePeliculas);
		System.out.println(gestor.listaPeliculas());

		System.out.println("--------------------------------------------");

		ModeloPelicula peliculaModificada2 = context.getBean("Pelicula", ModeloPelicula.class);
		peliculaModificada2.setTitulo("AmericanPie2");
		peliculaModificada2.setDirector("ABOMBAO");
		ModeloPelicula peliculaModificada5 = context.getBean("Pelicula", ModeloPelicula.class);
		peliculaModificada5.setTitulo("AmericanPie5");
		peliculaModificada5.setDirector("BELUGA");

		List<ModeloPelicula> miListaDePeliculasModificada = new ArrayList<>();

		miListaDePeliculasModificada.add(peliculaModificada2);
		miListaDePeliculasModificada.add(peliculaModificada5);

		gestor.updatePeliculas(miListaDePeliculasModificada);
		System.out.println(gestor.listaPeliculas());

		System.out.println("--------------------------------------------");

		gestor.deletePelicula(Arrays.asList("AmericanPie1", "AmericanPie2"));

		System.out.println(gestor.listaPeliculas());

		System.out.println("----FIN----");

	}
}
