package com.spring.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.domain.Produto;

// Camada de acesso aos dados
@Repository
// JpaRepository capaz de acessar os dados a partir de um tipo que for passado 
// (objeto Categoria, Tipo identificador do atributo)
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
