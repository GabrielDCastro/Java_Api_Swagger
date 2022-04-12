package br.com.ilia.digital.folhadeponto.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_RELATORIO")
public class Relatorio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String mes;
	
	private String horasTrabalhadas;
	
	private String horasExcedentes;
	
	private String horasDevidas;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Alocacao> alocacoes;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Registro> registros;

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getHorasExcedentes() {
		return horasExcedentes;
	}

	public void setHorasExcedentes(String horasExcedentes) {
		this.horasExcedentes = horasExcedentes;
	}

	public String getHorasDevidas() {
		return horasDevidas;
	}

	public void setHorasDevidas(String horasDevidas) {
		this.horasDevidas = horasDevidas;
	}

	public List<Registro> getRegistro() {
		return registros;
	}

	public void setRegistro(List<Registro> registros) {
		this.registros = registros;
	}


}
