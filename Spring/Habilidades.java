package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class Habilidades {
	
	@GetMapping
	public String habilidades() {
		return "Habilidades: Atenção aos Detalhes & Proatividade , Mentabilidades: Responsabilidade Pessoal & Persistência";
	}
}
