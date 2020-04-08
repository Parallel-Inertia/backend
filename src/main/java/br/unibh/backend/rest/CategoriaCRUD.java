package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Categoria;

public interface CategoriaCRUD extends CrudRepository<Categoria, Long> {
	
}