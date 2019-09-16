package br.aepprog.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Conceito {
	
	@Id
	private String id;
	
	@ManyToOne
	@JoinColumn(name = "nota_fk")
	private Nota nota;
	
	@NotNull
	@ManyToOne(targetEntity = Avaliacao.class)
	@JoinColumn(name = "avaliacao_fk")
	private Avaliacao avaliacao;
	
	@NotNull
	@ManyToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "aluno_fk")
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
