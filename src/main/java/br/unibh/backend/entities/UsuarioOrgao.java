package br.unibh.backend.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "usuario_orgao")
public class UsuarioOrgao extends Usuario{
	public UsuarioOrgao(Long id, Date dataCriacao, Date dataModificacao, String nome, String email, String telefone,
			String senha, Long funcional, OrgaoPublico orgaoPublico) {
		super(id, dataCriacao, dataModificacao, nome, email, telefone, senha);
		this.funcional = funcional;
		this.orgaoPublico = orgaoPublico;
	}
	
	public UsuarioOrgao() {
		
	}
	

	@Column(nullable = false, unique = true)
	private Long funcional;
	
	@OneToOne(optional = false)
	private OrgaoPublico orgaoPublico;


	public Long getFuncional() {
		return funcional;
	}

	public void setFuncional(Long funcional) {
		this.funcional = funcional;
	}
	
	public OrgaoPublico getOrgaoPublico() {
		return orgaoPublico;
	}

	public void setOrgaoPublico(OrgaoPublico orgaoPublico) {
		this.orgaoPublico = orgaoPublico;
	}
}
