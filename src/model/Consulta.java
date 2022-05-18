package model;

import java.sql.Time;

import org.hibernate.annotations.TimeZoneColumn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "consulta")
public class Consulta {

	@Id
	@ManyToOne
	@JoinColumn(name = "nb_paciente")
	@NotNull
	private Paciente paciente;

	@Id
	@ManyToOne
	@JoinColumn(name = "codigo_medico")
	@NotNull
	private Medico medico;

	@Column(name = "dia_consulta")
	@NotNull
	private int dia;

	@Column(name = "horario_consulta")
	@NotNull
	@TimeZoneColumn
	private Time horario;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Consulta [paciente=" + paciente + ", medico=" + medico + ", dia=" + dia + ", horario=" + horario + "]";
	}

}
