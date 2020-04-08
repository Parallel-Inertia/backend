package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.UsuarioCidadao;

public interface UsuarioCidadaoCRUD extends CrudRepository<UsuarioCidadao, Long>{

}