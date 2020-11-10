package com.eventosapp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class EventoModel implements Serializable{ //implementando essa interface

	//FAZ PARTE DA GERAÇÃO AUTOMATICA DO ID
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	private String nome;
	
	private String local;
	
	private String data;
	
	private String horario;
	
	@OneToMany
	private List<ConvidadoModel> convidado;

	
	//MÉTODOS GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public List<ConvidadoModel> getConvidado() {
		return convidado;
	}

	public void setConvidado(List<ConvidadoModel> convidado) {
		this.convidado = convidado;
	}

	
	
	
	
}
