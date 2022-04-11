package br.com.ilia.digital.folhadeponto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ilia.digital.folhadeponto.models.Relatorio;
import br.com.ilia.digital.folhadeponto.repository.RelatorioRepository;

@RestController
@RequestMapping(value="/v1")
public class RelatorioController {
	
	@Autowired
	RelatorioRepository relatorioRepository;
	
	@GetMapping("/relatorios")
	public List<Relatorio> listaRelatorios(){
		return relatorioRepository.findAll();
	}
	
	@GetMapping("/folhas-de-ponto/{mes}")
	public Relatorio relatorioMensal(@PathVariable(value="mes") String mes){
		return relatorioRepository.findByMes(mes);
	}

}
