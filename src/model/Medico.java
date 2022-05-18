package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico {

	@Id
	@Column(name = "codigo")
	@NotNull
	private int codigo;

	@Column(name = "nome_medico", length = 100)
	@NotNull
	private String nome;

	@Column(name = "logradouro_end", length = 100)
	@NotNull
	private String logradouro_end;

	@Column(name = "numero_end")
	@NotNull
	private int numero_end;

	@Column(name = "cep_end", length = 8)
	@NotNull
	private String cep_end;

	@Column(name = "contato", length = 11)
	@NotNull
	private String contato;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro_end() {
		return logradouro_end;
	}

	public void setLogradouro_end(String logradouro_end) {
		this.logradouro_end = logradouro_end;
	}

	public int getNumero_end() {
		return numero_end;
	}

	public void setNumero_end(int numero_end) {
		this.numero_end = numero_end;
	}

	public String getCep_end() {
		return cep_end;
	}

	public void setCep_end(String cep_end) {
		this.cep_end = cep_end;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", nome=" + nome + ", logradouro_end=" + logradouro_end + ", numero_end="
				+ numero_end + ", cep_end=" + cep_end + ", contato=" + contato + "]";
	}

}
