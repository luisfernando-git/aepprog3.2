package br.aepprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aepprog.model.Nota;

public interface NotaRepository extends JpaRepository<Nota, String>{

}
