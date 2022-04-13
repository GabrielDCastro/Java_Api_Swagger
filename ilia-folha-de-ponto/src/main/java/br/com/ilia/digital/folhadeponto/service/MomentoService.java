package br.com.ilia.digital.folhadeponto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ilia.digital.folhadeponto.models.Momento;
import br.com.ilia.digital.folhadeponto.models.dto.MomentoDTO;
import br.com.ilia.digital.folhadeponto.repository.MomentoRepository;

@Service
public class MomentoService {
	@Autowired
	MomentoRepository momentoRepository;
	
	private Momento momentoFromDTO(MomentoDTO momentoDto) {
		Momento momento = new Momento();
		momento.setDataHora(momentoDto.getDataHora());
		return momento;
	}
	
	public Momento salvar(MomentoDTO momento) {
		Momento obj = momentoFromDTO(momento);
		obj = momentoRepository.save(obj);
		return obj;
	}
	
	public List<Momento> listar() {
		return momentoRepository.findAll();
	}
	
}
