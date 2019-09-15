package br.aepprog.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Nota {

	@Id
	private String id;
	
	@Min(value = 0)
	@Max(value = 10)
	private double valor;
	
	public Nota() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public double getValor() {
		return valor;
	}
}
