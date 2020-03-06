package com.recetas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RecetasCocina")
public class RecetasCocinaController {

	@RequestMapping("/help")
	public String helloWorld() {
		return "Hola mundo!!!!!!";
	}
}
