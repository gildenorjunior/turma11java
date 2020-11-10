package com.eventosapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_convidado")
public class ConvidadoModel {

	@Id
	@NotNull
	private Long rg;
	
	@NotNull
	private String nomeConvidado;

	@ManyToOne
	private EventoModel evento;
	
	
	

	



	

	
	

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public EventoModel getEvento() {
		return evento;
	}

	public void setEvento(EventoModel evento) {
		this.evento = evento;
	}
	
	
	
}
