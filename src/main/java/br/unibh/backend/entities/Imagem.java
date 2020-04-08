package br.unibh.backend.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Imagem extends EntidadeBasica{
	public Imagem(Long id, Date dataCriacao, Date dataModificacao, String caminho, Reclamacao reclamacao) {
		super(id, dataCriacao, dataModificacao);
		this.caminho = caminho;
		this.reclamacao = reclamacao;
	}
	
	public Imagem() {
		
	}
	

	@Column(nullable = false, unique = true)
	private String caminho;

	@ManyToOne(optional = false)
	private Reclamacao reclamacao;
	
	
	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public Reclamacao getReclamacao() {
		return reclamacao;
	}

	public void setReclamacao(Reclamacao reclamacao) {
		this.reclamacao = reclamacao;
	}
}
