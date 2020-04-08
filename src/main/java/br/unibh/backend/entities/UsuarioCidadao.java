package br.unibh.backend.entities;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity(name = "usuario_cidadao")
public class UsuarioCidadao extends Usuario{
	public UsuarioCidadao(Long id, Date dataCriacao, Date dataModificacao, String nome, String email, String telefone,
			String senha, Long cpf, EnderecoUsuarioCidadao endereco, Set<Reclamacao> reclamacoes) {
		super(id, dataCriacao, dataModificacao, nome, email, telefone, senha);
		this.cpf = cpf;
		this.endereco = endereco;
		this.reclamacoes = reclamacoes;
	}

	public UsuarioCidadao() {
		
	}
	

	@Column(nullable = false, unique = true)
	private Long cpf;
	
	@OneToOne
	private EnderecoUsuarioCidadao endereco;

	@OneToMany(mappedBy = "usuario")
	private Set<Reclamacao> reclamacoes;


	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoUsuarioCidadao endereco) {
		this.endereco = endereco;
	}
	
	public Set<Reclamacao> getReclamacoes() {
		return reclamacoes;
	}

	public void setReclamacoes(Set<Reclamacao> reclamacoes) {
		this.reclamacoes = reclamacoes;
	}
}