package com.sopra.spring.ejemplo02Spring.ej02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Lanzador {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ej02.xlm");
		List<Chorizo> ristraDeChorizos = context.getBean("miLista", List.class);
		
		for(int i=0; i<10; i++) {
			ristraDeChorizos.add(context.getBean("chorizo", Chorizo.class));
		}
		System.out.println(ristraDeChorizos);
		ristraDeChorizos.get(3).setMarca("Ezequiel");
		System.out.println(ristraDeChorizos);
		((AbstractApplicationContext)context).close();

	}

}
