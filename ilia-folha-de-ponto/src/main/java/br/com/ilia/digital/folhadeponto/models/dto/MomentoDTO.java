package br.com.ilia.digital.folhadeponto.models.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.ilia.digital.folhadeponto.service.validation.MomentoInsert;
import br.com.ilia.digital.folhadeponto.service.validation.ValidDate;

@MomentoInsert
public class MomentoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Campo obrigatório não informado")
	@NotEmpty(message = "Campo obrigatório não informado")
	@ValidDate(message = "Data e hora em formato inválido")
	private String dataHora;

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

}
