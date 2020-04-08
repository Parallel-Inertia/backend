package br.unibh.backend.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Endereco extends EntidadeBasica{
	public Endereco(Long id, Date dataCriacao, Date dataModificacao, String rua, String numero, String complemento,
			int cep, Cidade cidade, UsuarioCidadao usuario) {
		super(id, dataCriacao, dataModificacao);
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	public Endereco() {
		
	}
	

	@Column(nullable = false, length = 150)
	private String rua;

	@Column(nullable = false, length = 10)
	private String numero;
	
	@Column(nullable = true, length = 100)
	private String complemento;
	
	@Column(nullable = false)
	private int cep;
	
	@ManyToOne(optional = false)
	private Cidade cidade;


	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}