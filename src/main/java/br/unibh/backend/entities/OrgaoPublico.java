package br.unibh.backend.entities;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "orgao_publico")
public class OrgaoPublico extends EntidadeBasica{
	public OrgaoPublico(Long id, Date dataCriacao, Date dataModificacao, String nome, String email,
			Set<Categoria> categorias, UsuarioOrgao usuario, Set<Reclamacao> reclamacoes) {
		super(id, dataCriacao, dataModificacao);
		this.nome = nome;
		this.email = email;
		this.categorias = categorias;
		this.usuario = usuario;
		this.reclamacoes = reclamacoes;
	}

	public OrgaoPublico() {
		
	}
	

	@Column(nullable = false, unique = true, length = 100)
	private String nome;

	@Column(nullable = false, unique = true, length = 100)
	private String email;
	
	//USAR O NOME DO ATRIBUTO QUE RECEBE O SET<OrgaoPublico> NA CLASSE Categoria
	@ManyToMany(mappedBy = "orgaosPublicos")
	private Set<Categoria> categorias;

	@OneToOne(optional = false)
	private UsuarioOrgao usuario;
	
	@OneToMany(mappedBy = "orgaoPublico")
	private Set<Reclamacao> reclamacoes;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

	public UsuarioOrgao getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioOrgao usuario) {
		this.usuario = usuario;
	}
	
	public Set<Reclamacao> getReclamacoes() {
		return reclamacoes;
	}

	public void setReclamacoes(Set<Reclamacao> reclamacoes) {
		this.reclamacoes = reclamacoes;
	}
}
