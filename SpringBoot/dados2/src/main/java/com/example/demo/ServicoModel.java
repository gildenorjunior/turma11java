package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity; //JPA
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ServicoModel { // Model sempre é o banco de dados

	@Id // criando a coluna id da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // adicionando o auto incremento
	private Long id;

	@Column
	private String nomeServico;

	@Column
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date date;

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
