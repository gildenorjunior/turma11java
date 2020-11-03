package com.primeiraatividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira-atividade")
public class PrimeiraAtividadeController {

	
	@GetMapping
	public String mostraMensagem() {
		return "Mensagem";
	}
}
