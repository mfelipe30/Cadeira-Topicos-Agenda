package br.com.posestacio.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.posestacio.agenda.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {

}
