package br.unibh.backend.entities;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Estado extends EntidadeBasica{
	public Estado(Long id, Date dataCriacao, Date dataModificacao, String nome, Set<Cidade> cidades) {
		super(id, dataCriacao, dataModificacao);
		this.nome = nome;
		this.cidades = cidades;
	}

	public Estado() {
	
	}
	

	@Column(nullable = false, unique = true, length = 25)
	private String nome;
	
	@OneToMany(mappedBy = "estado")
	private Set<Cidade> cidades;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(Set<Cidade> cidades) {
		this.cidades = cidades;
	}
}
