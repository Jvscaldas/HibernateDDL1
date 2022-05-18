package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@Column(name = "nb_paciente")
	@NotNull
	private int nb;
	
	@Column(name = "nome_paciente", length = 100)
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
	
	@Column(name = "telefone", length = 11)
	@NotNull
	private String telefone;

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Paciente [nb=" + nb + ", nome=" + nome + ", logradouro_end=" + logradouro_end + ", numero_end="
				+ numero_end + ", cep_end=" + cep_end + ", telefone=" + telefone + "]";
	}

}
