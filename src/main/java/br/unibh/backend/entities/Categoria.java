package br.unibh.backend.entities;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Categoria extends EntidadeBasica{
	public Categoria(Long id, Date dataCriacao, Date dataModificacao, String nome, Set<OrgaoPublico> orgaosPublicos,
			Set<Reclamacao> reclamacoes) {
		super(id, dataCriacao, dataModificacao);
		this.nome = nome;
		this.orgaosPublicos = orgaosPublicos;
		this.reclamacoes = reclamacoes;
	}

	public Categoria() {
		
	}
	

	@Column(nullable = false, unique = true, length = 50)
	private String nome;

	//USAR O NOME DO ATRIBUTO QUE RECEBE O SET<Categoria> NA CLASSE OrgaoPublico
	//CASCADE USADO PARA POR EXEMPLO UMA DELEÇÃO EM CASCATA (USADO APENAS EM UMA DAS ENTIDADES RELACIONADAS EM 'ManyToMany'; O MESMO ACONTECE COM O JoinTable);
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private Set<OrgaoPublico> orgaosPublicos;

	@OneToMany(mappedBy = "categoria")
	private Set<Reclamacao> reclamacoes;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<OrgaoPublico> getOrgaosPublicos() {
		return orgaosPublicos;
	}

	public void setOrgaosPublicos(Set<OrgaoPublico> orgaosPublicos) {
		this.orgaosPublicos = orgaosPublicos;
	}

	public Set<Reclamacao> getReclamacoes() {
		return reclamacoes;
	}

	public void setReclamacoes(Set<Reclamacao> reclamacoes) {
		this.reclamacoes = reclamacoes;
	}
}
