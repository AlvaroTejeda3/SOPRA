package com.sopra.spring.ejemplo02Spring.ej03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzador03 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ej03.xml");
		
		Cubata cerveza = context.getBean("cubataDeCerveza",Cubata.class);
		System.out.println(cerveza);
		
		Cubata vinote = context.getBean("copaDeVino",Cubata.class);
		System.out.println(vinote);
		
		Cubata miCaña = context.getBean("cañaDeRuben",Cubata.class);
		System.out.println(miCaña);
		Licor licor = context.getBean("vinote",Licor.class);
		miCaña.setLicor(licor);
		
		Cubata miCañaSingleton = context.getBean("cañaDeRuben",Cubata.class);
		System.out.println(miCaña);
		
		
	}

}
