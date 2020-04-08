package br.unibh.backend.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class EnderecoReclamacao extends Endereco{
	
	public EnderecoReclamacao() {
		
	}
	
	@OneToOne(optional = false)
	private Reclamacao reclamacao;
	
	public Reclamacao getReclamacao() {
		return reclamacao;
	}

	public void setReclamacao(Reclamacao reclamacao) {
		this.reclamacao = reclamacao;
	}

}
