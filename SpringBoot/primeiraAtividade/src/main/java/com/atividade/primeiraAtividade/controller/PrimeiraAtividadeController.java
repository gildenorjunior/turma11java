package com.atividade.primeiraAtividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/atividade")
public class PrimeiraAtividadeController {

	
	@GetMapping("/primeira")
	public String mostraMensagem1() {
		return "Nesta atividade eu utilizei as mentalidade e habilidades seguintes: \n"
				+ "Persistência, Atenção aos detalhes e Mentalidade de Crescimento";
	}
	
	@GetMapping("/segunda")
	public String mostraMensagem2() {
		return "Meus objetivos de aprendizagem para esta semanas serão aprender o básico e conceitos de Spring Boot";
	}
	
}
