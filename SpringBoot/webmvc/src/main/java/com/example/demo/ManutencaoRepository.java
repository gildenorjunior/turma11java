package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long>{ //essa classe serve para levar a tabela até o banco de dados

}
