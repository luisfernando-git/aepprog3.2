package br.aepprog.model;

import java.util.UUID;

import javax.persistence.Id;

public class Avaliacao {

	@Id
	private String id;
	
	private String descricao;
	
	public Avaliacao() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
