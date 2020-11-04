package com.example.demo;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	private ManutencaoRepository repository; //instanciando o objeto repository
	
	
	//QUATRO MÉTODOS, GET, POST, PUT E DELETE
	//GETBYID, GETBYNOME
	//localhost:8080/manutencao 			só isso pq eu não criei o request ali emcima, senao teria mais um caminho ali no meio.
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> buscarTodos(){ //getmapping busca todos os dados
		return repository.findAll();
	}
	
	//request body pegar o que esta no corpo inserir 
	@GetMapping("/manutencoes/{id}") //é igual select id where 
	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) {//PATH VARIABLE É UMA NOTAÇÃO UTILIZADA PARA PASSAR UM ID ou qualquer outro parametro
		return repository.findById(id); //procura por id 
	}
	
	//post == inserir
	//localhost:8080/manutencoes
	@PostMapping("/manutencoes")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetoManutencao) { //criando o objeto (objetoManutencao) de ManutencaoTable
		repository.save(objetoManutencao);
		return objetoManutencao;
	}
	
	
	//put é atualizar
	@PutMapping("/manutencoes/{id}")
	public ManutencaoTable atualizar(@PathVariable Long id, @RequestBody ManutencaoTable objetinho) {
		objetinho.setId(id);
		repository.save(objetinho);
		return objetinho;
	}
	
	@GetMapping("/manutencoes/teste/{nome}")
	public List<ManutencaoTable> buscarPorNome (@PathVariable String nome) {
		return repository.findByNome(nome);
	}
	
	@GetMapping("/manutencoes/{nome}/{categoria}")
	public Optional<ManutencaoTable> findByNomeAndCategoria (@PathVariable String nome, @PathVariable String categoria) {
		return repository.findByNomeAndCategoria(nome, categoria);
	}
	
	@DeleteMapping("/manutencao/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
