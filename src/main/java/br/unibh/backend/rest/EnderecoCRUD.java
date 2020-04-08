package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Endereco;

public interface EnderecoCRUD extends CrudRepository<Endereco, Long>{

}