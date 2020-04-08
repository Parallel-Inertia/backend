package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Imagem;

public interface ImagemCRUD extends CrudRepository<Imagem, Long>{

}