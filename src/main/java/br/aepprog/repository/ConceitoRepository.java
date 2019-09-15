package br.aepprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aepprog.model.Conceito;

public interface ConceitoRepository extends JpaRepository<Conceito, String>{

}
