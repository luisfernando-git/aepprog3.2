package br.aepprog.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conceito {
	
	@Id
	private String id;
	
	private Nota nota;
	
	@Column(nullable = false)
	private Avaliacao avaliacao;
	
	@Column(nullable = false)
	private Aluno aluno;

	public Conceito() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}

	public Nota getNota() {
		return nota;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public Aluno getAluno() {
		return aluno;
	}	
}
