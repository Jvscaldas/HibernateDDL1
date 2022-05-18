package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "especialidade")
public class Especialidade {

	@Id
	@ManyToOne
	@JoinColumn(name = "codigo_medico")
	@NotNull
	private Medico medico;
	
	@Column(name = "especialidade", length = 200)
	@NotNull
	private String especialidade;

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Especialidade [medico=" + medico + ", especialidade=" + especialidade + "]";
	}

}
