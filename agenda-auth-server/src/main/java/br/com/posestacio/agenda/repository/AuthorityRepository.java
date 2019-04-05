package br.com.posestacio.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.posestacio.agenda.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

	Authority findByName(String name);
	
}
