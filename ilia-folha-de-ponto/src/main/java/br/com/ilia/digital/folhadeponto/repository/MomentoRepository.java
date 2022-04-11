package br.com.ilia.digital.folhadeponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilia.digital.folhadeponto.models.Momento;

public interface MomentoRepository extends JpaRepository<Momento, String>{

}
