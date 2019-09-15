package br.aepprog.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	private String id;
	
	private String nome;
	
	public Aluno() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
}
