package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.blogpessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
