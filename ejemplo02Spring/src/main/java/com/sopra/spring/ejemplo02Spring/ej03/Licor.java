package com.sopra.spring.ejemplo02Spring.ej03;

public class Licor {
	
	private String nombre;
	private String graduacion;
	
	

	@Override
	public String toString() {
		return nombre+" "+graduacion+" "+"grados de alcohol";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGraduacion() {
		return graduacion;
	}
	public void setGraduacion(String graduacion) {
		this.graduacion = graduacion;
	}
	
	

}
