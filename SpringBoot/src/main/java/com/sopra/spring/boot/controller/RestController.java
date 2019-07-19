package com.sopra.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Value("${mensaje: Ola k ase?}")
	private String mensaje;

	@RequestMapping("/")
	public String saludar() {
		return mensaje;
	}

}
