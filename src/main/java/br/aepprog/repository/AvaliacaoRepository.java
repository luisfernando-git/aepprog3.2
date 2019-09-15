package br.aepprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aepprog.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, String>{

}
