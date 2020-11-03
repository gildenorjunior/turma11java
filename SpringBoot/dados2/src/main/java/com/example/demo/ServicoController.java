package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//criando um ponto no endereçamento do site
@RequestMapping("/hello")
@RestController
public class ServicoController { // Controler é o cerebro do programa e o endereçamento

	// injeção de repositório, para comunicar com a tabela do banco
	@Autowired
	private ServicoRepository repository;

	//get vai pegar
	//get com find all procurar todos
	//está lista pq é uma tabela // pegando os dados banco e retornando na lista
	@GetMapping("/servicos")
	public List<ServicoModel> pegarTodos() {
		return repository.findAll(); //ele tem que retornar o apelido que eu dei para a tabela (repository)
	}
	
	//post é responsavel por inserir
	@PostMapping("/servicos")
	public ServicoModel criar (@RequestBody ServicoModel tabelaServico) { //tabelaServico é o apelido que eu dei, request body é responsavel por inserir o dado dentro do corpo
		repository.save(tabelaServico); //salvando na tabelaServico que é o apelido que eu dei pra ServicoModel
		return tabelaServico;
	}
	

//	@GetMapping("/get1")
//	public String hello1() {
//		return "Hey Get1 Hello World";
//	}
//	
//	@GetMapping("/get2")
//	public String hello2() {
//		return "Hey Get2 Hello World";
//	}

	// http://www.site.com.br/hello/get1/get2

}
