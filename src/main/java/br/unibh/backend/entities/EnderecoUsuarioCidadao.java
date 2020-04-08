package br.unibh.backend.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class EnderecoUsuarioCidadao extends Endereco {
	
	public EnderecoUsuarioCidadao() {
		
	}
	
	@OneToOne(optional = false)
	private UsuarioCidadao usuario;
	
	public UsuarioCidadao getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioCidadao usuario) {
		this.usuario = usuario;
	}

}
