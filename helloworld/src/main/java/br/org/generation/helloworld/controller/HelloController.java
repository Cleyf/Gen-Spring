package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!!! (Utilizei de Orientação aos detalhes, e sempre não pode faltar mentalidade de crescimento) ";
	}
	
	@GetMapping("/2") 
	public String hello2() {
		return "Hello World!!! (Quero me dedicar ao maximo para aprender Spring, pois me sinto realizado estudando programação) ";
	}
}
