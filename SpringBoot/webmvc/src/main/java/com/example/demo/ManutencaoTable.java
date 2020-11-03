package com.example.demo;

import javax.persistence.Id;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.hibernate.type.DateType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

//cria a tabela

@Entity
@Table(name = "tb_manutencao") //definindo o nome da tabela para não ser automatico
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
	private DateType data;
	
	@Column
	private boolean pago;
	
	
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

	public DateType getData() {
		return data;
	}

	public void setData(DateType data) {
		this.data = data;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	
	
}
