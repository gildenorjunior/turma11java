package com.example.GerenciadorDeProdutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.GerenciadorDeProdutos.entity.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}
