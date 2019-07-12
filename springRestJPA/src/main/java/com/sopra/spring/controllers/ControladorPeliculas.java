package com.sopra.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.model.entities.AlmacenDePeliculas;
import com.sopra.spring.model.entities.ModeloPeliculaJPA;

@RestController
public class ControladorPeliculas {

	@Autowired
	private AlmacenDePeliculas almacen;

	@GetMapping("/peliculas")
	public List<ModeloPeliculaJPA> peliculas() {
		return almacen.findAll();
	}

	@GetMapping("(/pelicula/{titulo}")
	public ModeloPeliculaJPA peli(@PathVariable String titulo) {
		return almacen.findById(titulo).orElse(null);
	}

	@PostMapping("/peliculas")
	public ModeloPeliculaJPA agregarPelicula(@RequestBody ModeloPeliculaJPA pelicula) {
		return almacen.save(pelicula);
	}

	@PutMapping("/peliculas/{titulo}")
	public ModeloPeliculaJPA actualizarPelicula(@RequestBody ModeloPeliculaJPA pelicula, @PathVariable String titulo) {
		return almacen.findById(titulo).map(peliculaEncontrada -> {
			peliculaEncontrada.setTitulo(pelicula.getTitulo());
			peliculaEncontrada.setDirector(pelicula.getDirector());
			peliculaEncontrada.setSinopsis(pelicula.getSinopsis());
			return almacen.save(peliculaEncontrada);
		}).orElseGet(() -> {
			return almacen.save(pelicula);

		});
	}

	@DeleteMapping("/peliculas/{titulo}")
	public void eliminarPelicula(@PathVariable String titulo) {
		almacen.deleteById(titulo);
	}
}
