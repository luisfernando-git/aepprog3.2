package br.aepprog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aepprog.model.Aluno;
import br.aepprog.repository.AlunoRepository;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repo;
	
	@GetMapping
	public List<Aluno> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public String create(@RequestBody Aluno novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Aluno getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id, @RequestBody Aluno aluno) {
		if (!id.equals(aluno.getId())) {
			throw new RuntimeException("Id do aluno está incorreto!");
		}
		repo.save(aluno);	
	}
}
