package br.unibh.backend.entities;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Reclamacao extends EntidadeBasica{
	public Reclamacao(Long id, Date dataCriacao, Date dataModificacao, String titulo, String descricao, long celular,
			long celularOpcional, String resposta, Status status, String consideracoesFinais, Categoria categoria,
			OrgaoPublico orgaoPublico, UsuarioCidadao usuario, EnderecoReclamacao endereco, Set<Imagem> imagens) {
		super(id, dataCriacao, dataModificacao);
		this.titulo = titulo;
		this.descricao = descricao;
		this.celular = celular;
		this.celularOpcional = celularOpcional;
		this.resposta = resposta;
		this.status = status;
		this.consideracoesFinais = consideracoesFinais;
		this.categoria = categoria;
		this.orgaoPublico = orgaoPublico;
		this.usuario = usuario;
		this.endereco = endereco;
		this.imagens = imagens;
	}

	public Reclamacao() {
		
	}
	

	@Column(nullable = false)
	private String titulo;

	@Lob
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false, unique = true)
	private long celular;
	
	@Column(nullable = true, unique = true)
	private long celularOpcional;
	
	@Lob
	@Column(nullable = true)
	private String resposta;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false)
	private Status status;
	
	@Lob
	@Column(nullable = true)
	private String consideracoesFinais;
	
	@ManyToOne(optional = false)
	private Categoria categoria;
	
	@ManyToOne(optional = false)
	private OrgaoPublico orgaoPublico;
	
	@ManyToOne(optional = false)
	private UsuarioCidadao usuario;
	
	@OneToOne(optional = false)
	private EnderecoReclamacao endereco;
	
	@OneToMany(mappedBy = "reclamacao")
	private Set<Imagem> imagens;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public long getCelularOpcional() {
		return celularOpcional;
	}

	public void setCelularOpcional(long celularOpcional) {
		this.celularOpcional = celularOpcional;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getConsideracoesFinais() {
		return consideracoesFinais;
	}

	public void setConsideracoesFinais(String consideracoesFinais) {
		this.consideracoesFinais = consideracoesFinais;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public OrgaoPublico getOrgaoPublico() {
		return orgaoPublico;
	}

	public void setOrgaoPublico(OrgaoPublico orgaoPublico) {
		this.orgaoPublico = orgaoPublico;
	}

	public UsuarioCidadao getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioCidadao usuario) {
		this.usuario = usuario;
	}

	public EnderecoReclamacao getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoReclamacao endereco) {
		this.endereco = endereco;
	}
	
	public Set<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(Set<Imagem> imagens) {
		this.imagens = imagens;
	}
}
