package com.example.demo;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@RestController
public class Controller implements WebMvcConfigurer { //o Web ele vai habilitar o roteamento de endereços
 
	//para acessar a página pelo local host 8080
	public void addViewControllers (ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	@Autowired
	private ManutencaoRepository repository;
	
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> buscarTodos(){ //getmapping busca todos os dados
		return repository.findAll();
	}
	
	@GetMapping("/manutencoes/{id}") //é igual select id where 
	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) {
		return repository.findById(id); //procura por id 
	}
	
	@PostMapping("/manutencoes")
	public ManutencaoTable criar (@RequestBody ManutencaoTable objetoManutencao) {
		repository.save(objetoManutencao);
		return objetoManutencao;
	}
	
}
