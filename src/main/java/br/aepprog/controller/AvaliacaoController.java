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

import br.aepprog.model.Avaliacao;
import br.aepprog.repository.AvaliacaoRepository;

@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

	@Autowired
	private AvaliacaoRepository repo;
	
	@GetMapping
	public List<Avaliacao> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public String create(@RequestBody Avaliacao nova) {
		repo.save(nova);
		return nova.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Avaliacao getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id, @RequestBody Avaliacao avaliacao) {
		if (!id.equals(avaliacao.getId())) {
			throw new RuntimeException("Id da avaliacao está incorreto!");
		}
		repo.save(avaliacao);	
	}
}
