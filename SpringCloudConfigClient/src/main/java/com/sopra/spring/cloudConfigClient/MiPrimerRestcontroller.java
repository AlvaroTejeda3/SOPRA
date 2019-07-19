package com.sopra.spring.cloudConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiPrimerRestcontroller {

	@Value("${mensaje:Hola Que Tal?}")
	private String mensaje;

	@RequestMapping("/")
	public String saludar() {
		return mensaje;
	}

}
