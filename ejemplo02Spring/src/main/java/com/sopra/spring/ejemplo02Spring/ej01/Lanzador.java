package com.sopra.spring.ejemplo02Spring.ej01;

/**
 * Hello world!
 *
 */
public class Lanzador 
{
	private static BarDeCopas miBarDECopasFavorito;
	
    public static void main( String[] args )
    {
       BarDeCopas elBuzon =  new BarDeCopas();
       elBuzon.setNombre("El buzon de mierda");
       elBuzon.setCalidadDeLaBebida("XXXX"); 
       Lanzador.miBarDECopasFavorito = elBuzon;
       System.out.println(elBuzon);
       cambiamosDeCalidad();
       System.out.println(elBuzon);
       
       
    }
    
    public static void cambiamosDeCalidad() {
    	
    	miBarDECopasFavorito.setCalidadDeLaBebida("XXX");
    }
    
    
}
