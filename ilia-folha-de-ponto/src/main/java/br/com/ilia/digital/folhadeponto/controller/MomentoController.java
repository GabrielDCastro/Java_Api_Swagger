package br.com.ilia.digital.folhadeponto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ilia.digital.folhadeponto.models.Momento;
import br.com.ilia.digital.folhadeponto.repository.MomentoRepository;

@RestController
@RequestMapping(value="/v1")
public class MomentoController {
	
	@Autowired
	MomentoRepository momentoRepository;
	
	@PostMapping("/batidas")
	public Momento insereBatida(@RequestBody Momento momento) {
		return momentoRepository.save(momento);
	}

}
