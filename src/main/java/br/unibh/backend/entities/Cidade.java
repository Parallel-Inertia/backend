package br.unibh.backend.entities;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cidade extends EntidadeBasica{
	public Cidade(Long id, Date dataCriacao, Date dataModificacao, String nome, Estado estado,
			Set<Endereco> enderecos) {
		super(id, dataCriacao, dataModificacao);
		this.nome = nome;
		this.estado = estado;
		this.enderecos = enderecos;
	}

	public Cidade() {
		
	}
	

	@Column(nullable = false, unique = true, length = 50)
	private String nome;
	
	@ManyToOne(optional = false)
	private Estado estado;

	@OneToMany(mappedBy = "cidade")
	private Set<Endereco> enderecos;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
}
