package br.org.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	 
	public List<Produto> findByPrecoBetween(BigDecimal start,BigDecimal end);
}
