package br.com.ilia.digital.folhadeponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilia.digital.folhadeponto.models.Registro;

public interface RegistroRepository extends JpaRepository<Registro, String>{

}
