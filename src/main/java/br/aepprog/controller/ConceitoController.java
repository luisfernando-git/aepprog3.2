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

import br.aepprog.model.Conceito;
import br.aepprog.repository.ConceitoRepository;

@RestController
@RequestMapping("/api/conceitos")
public class ConceitoController {

	@Autowired
	private ConceitoRepository repo;
	
	@GetMapping
	public List<Conceito> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public String create(@RequestBody Conceito novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Conceito getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id, @RequestBody Conceito conceito) {
		if (!id.equals(conceito.getId())) {
			throw new RuntimeException("Id do conceito está incorreto!");
		}
		repo.save(conceito);	
	}
}
