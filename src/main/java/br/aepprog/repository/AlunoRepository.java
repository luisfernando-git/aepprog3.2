package br.aepprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aepprog.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String>{

}
