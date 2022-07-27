package com.spring.demo.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.domain.Categoria;
import com.spring.demo.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    // O endpoint desse metodo vai ser /categorias/id
    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    // vai receber um id que vem na url
    // Response Entity tip especial que ja armazena varias informaçoes http para um serviço rest
    public ResponseEntity<?> find(@PathVariable Integer id){

        Optional<Categoria> obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);

    }

}
