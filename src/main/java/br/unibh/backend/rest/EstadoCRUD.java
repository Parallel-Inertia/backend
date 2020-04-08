package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Estado;

public interface EstadoCRUD extends CrudRepository<Estado, Long>{

}