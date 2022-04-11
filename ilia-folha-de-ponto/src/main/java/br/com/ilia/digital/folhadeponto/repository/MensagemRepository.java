package br.com.ilia.digital.folhadeponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilia.digital.folhadeponto.models.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, String>{

}
