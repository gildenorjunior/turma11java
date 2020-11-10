package com.example.GerenciadorDeProdutos.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GerenciadorDeProdutos.entity.ProdutoEntity;
import com.example.GerenciadorDeProdutos.repository.ProdutoRepository;

@Service
@Transactional
public class ProdutoService {

	
	@Autowired
	private ProdutoRepository repository;
	
	public List<ProdutoEntity> listAll(){
		return repository.findAll();
	}
	
	public void save(ProdutoEntity produto) {
		repository.save(produto);
	}
	
	public ProdutoEntity get(Long id) {
		return repository.findById(id).get();
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
	
	
}
