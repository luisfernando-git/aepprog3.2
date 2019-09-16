package br.aepprog.model;

import java.math.BigDecimal;
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
	private BigDecimal valor;
	
	public Nota() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
}
