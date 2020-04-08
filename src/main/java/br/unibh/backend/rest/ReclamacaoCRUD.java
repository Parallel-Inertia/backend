package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Reclamacao;

public interface ReclamacaoCRUD extends CrudRepository<Reclamacao, Long>{

}