package br.com.ilia.digital.folhadeponto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ilia.digital.folhadeponto.repository.AlocacaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import br.com.ilia.digital.folhadeponto.models.Alocacao;

@RestController
@RequestMapping(value="/v1")
@Api(value="API REST folha de ponto")
@CrossOrigin(origins="*")
public class AlocacaoController {

	@Autowired
	AlocacaoRepository alocacaoRepository;
	
	@GetMapping("/alocacoes")
	@ApiOperation(value="Retorna uma lista de Alocações")
	public List<Alocacao> listaAlocacao(){
		return alocacaoRepository.findAll();
	}
	
	@PostMapping("alocacoes")
	@ApiOperation(value="Insere uma Alocação")
	public Alocacao insereAlocacao(@RequestBody Alocacao alocacao) {
		return alocacaoRepository.save(alocacao);
	}
	
}
