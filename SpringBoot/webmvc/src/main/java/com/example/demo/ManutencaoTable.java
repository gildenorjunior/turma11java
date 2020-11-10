package com.example.demo;

import javax.persistence.Id;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

//cria a tabela
@Entity
@Table(name = "tb_manutencao_crud") //definindo o nome da tabela para não ser automatico
public class ManutencaoTable {

	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //para fazer o auto incremento
	private Long Id;
	
	@Column 
	@NotNull //não pode ser nulo
	private String nome;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd") //formatando a data
	private Date data;
	
	@Column
	//private boolean pago;
	private String pago;
	
	@Column
	private String categoria;
	
	
	//métodos getters and setters
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

//	public boolean isPago() {
//		return pago;
//	}
//
//	public void setPago(boolean pago) {
//		this.pago = pago;
//	}
	

	public String getCategoria() {
		return categoria;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
