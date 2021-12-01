package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	
	@GetMapping
	public String objetivos() {
		return "Objetivos: Aprender a trabalhar com o Spring e me desenvolver em MySQL";
	}
}
