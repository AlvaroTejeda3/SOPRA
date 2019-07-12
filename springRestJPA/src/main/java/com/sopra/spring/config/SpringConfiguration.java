package com.sopra.spring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.spring.model.entities.AlmacenDePeliculas;
import com.sopra.spring.model.entities.ModeloPeliculaJPA;

@Configuration
public class SpringConfiguration {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(AlmacenDePeliculas almacen) {
		return args -> {
			almacen.save(new ModeloPeliculaJPA("1 Capullo", "Charlie1", "Sjsefg1"));
			almacen.save(new ModeloPeliculaJPA("2 Capullos", "Charlie2", "Sjsefg2"));
			almacen.save(new ModeloPeliculaJPA("3 Capullos", "Charlie3", "Sjsefg3"));
		};
	}

}
