package com.example.demo;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	//fazendo uma injeção da interface ManutencaoRepository
	@Autowired
	private ManutencaoRepository repository; //instanciando o objeto repository
	
	@Autowired
	private Services service;
	
	@GetMapping("/teste")
    public ResponseEntity<List<ManutencaoTable>> listAllItens() {
        List<ManutencaoTable> itens= service.findAllItens();
        if(itens.isEmpty()){
            return new ResponseEntity<List<ManutencaoTable>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<ManutencaoTable>>(itens, HttpStatus.ACCEPTED);
    }
	
	//QUATRO MÉTODOS, GET, POST, PUT E DELETE
	//GETBYID, GETBYNOME
	//localhost:8080/manutencao 			só isso pq eu não criei o request ali emcima, senao teria mais um caminho ali no meio.
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> buscarTodos(){ //getmapping busca todos os dados
		return repository.findAll();
	}
	
	//
	
	//dessa forma quando não tiver id no postman vai retornar null
	//deste jeito nao retornar erro
//	@GetMapping("/manutencoes/id/{id}")
//	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) {
//		return repository.findById(id);
//	}
		
		//dessa forma quando não tiver id vai retornar not found
		@GetMapping("/manutencoes/id/{id}")
		public ResponseEntity<ManutencaoTable> getById(@PathVariable long id){
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
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
	public ManutencaoTable put(@PathVariable Long id, @RequestBody ManutencaoTable objetinho) {
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
