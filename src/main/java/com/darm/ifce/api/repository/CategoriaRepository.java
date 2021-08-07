package com.darm.ifce.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darm.ifce.api.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
