package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.OrgaoPublico;

public interface OrgaoPublicoCRUD extends CrudRepository<OrgaoPublico, Long>{

}