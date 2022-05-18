package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ficha")
public class Ficha {

	@Id
	@OneToOne
	@JoinColumn(name = "nb_paciente")
	@NotNull
	private Paciente paciente;

	@Id
	@OneToOne
	@JoinColumn(name = "codigo_medico_especialidade")
	@NotNull
	private Especialidade especialidade;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Ficha [paciente=" + paciente + ", especialidade=" + especialidade + "]";
	}

}
