package br.unibh.backend.rest;
import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.UsuarioOrgao;

public interface UsuarioOrgaoCRUD extends CrudRepository<UsuarioOrgao, Long> {
	
}