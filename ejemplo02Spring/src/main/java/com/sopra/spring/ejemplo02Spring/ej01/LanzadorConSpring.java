package com.sopra.spring.ejemplo02Spring.ej01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorConSpring {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("ej01.xml");

	public static void main(String[] args) {
		
		BarDeCopas elBuzon = context.getBean("elBuzon",BarDeCopas.class);
		System.out.println(elBuzon.toString());
		elBuzon.setCalidadDeLaBebida("Pues esto no mejora");
		cambiaMiCalidad();
		System.out.println(elBuzon.toString());
		
	}
	
	
	private static void cambiaMiCalidad(){
		BarDeCopas elBuzon = context.getBean("elBuzon",BarDeCopas.class);
		System.out.println(elBuzon.toString());
		elBuzon.setCalidadDeLaBebida("infame");
	}

}
