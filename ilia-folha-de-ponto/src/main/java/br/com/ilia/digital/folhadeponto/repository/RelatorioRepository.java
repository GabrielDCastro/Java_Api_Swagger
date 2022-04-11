package br.com.ilia.digital.folhadeponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilia.digital.folhadeponto.models.Relatorio;

public interface RelatorioRepository extends JpaRepository<Relatorio, String>{
	
	Relatorio findByMes(String mes);

}
