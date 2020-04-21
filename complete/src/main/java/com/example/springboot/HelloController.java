package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Primeiro projeto de Diego Moraes. Não tem problema";
	}
	@RequestMapping("/teste")
	public String teste() {
		return "Acessando o /teste";
	}

}
