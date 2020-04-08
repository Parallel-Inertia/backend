package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Cidade;

public interface CidadeCRUD extends CrudRepository<Cidade, Long>{

}