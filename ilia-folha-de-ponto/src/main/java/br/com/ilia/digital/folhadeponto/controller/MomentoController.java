package br.com.ilia.digital.folhadeponto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ilia.digital.folhadeponto.models.Momento;
import br.com.ilia.digital.folhadeponto.models.dto.MomentoDTO;
import br.com.ilia.digital.folhadeponto.service.MomentoService;

@RestController
@RequestMapping(value="/v1")
public class MomentoController {
	
	@Autowired
	MomentoService service;
	
	@PostMapping("/batidas")
	public Momento insereBatida(@Valid @RequestBody MomentoDTO momento) {
		return service.salvar(momento);
	}
	
	@GetMapping("/buscarBatidas")
	public List<Momento> listaMomento(){
		return service.listar();
	}

}
