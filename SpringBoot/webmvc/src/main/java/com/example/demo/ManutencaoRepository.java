package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//FAZ A CONDUÇÃO DOS DADOS DA TABELA AO BANCO
//É COMO SE FOSSE UM "CARTEIRO"
//PRA FAZER OS GETS E POSTS VOCÊ PRECISA PERSISTIR
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long>{

	//essa classe serve para levar a tabela até o banco de dados
	
	List<ManutencaoTable> findByNome(String nome); //método criado no controller para fazer a busca no GET por nome

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria); //método criado no controller para busca por nome E categoria

}
