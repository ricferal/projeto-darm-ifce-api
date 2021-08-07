package com.darm.ifce.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darm.ifce.api.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}