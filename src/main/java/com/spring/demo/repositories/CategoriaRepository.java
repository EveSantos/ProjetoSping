package com.spring.demo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.domain.Categoria;

// Camada de acesso aos dados
@Repository
// JpaRepository capaz de acessar os dados a partir de um tipo que for passado 
// (objeto Categoria, Tipo identificador do atributo)
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
