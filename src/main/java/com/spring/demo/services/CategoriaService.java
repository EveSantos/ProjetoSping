package com.spring.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.domain.Categoria;
import com.spring.demo.repositories.CategoriaRepository;
import com.spring.demo.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
    
    @Autowired
    // Dependencia de um objeto do tipo Categoria Repository
    private CategoriaRepository repo;

    // Criando metodo capaz de buscar por categoria
    public Optional<Categoria> buscar(Integer id){
        // Vai no banco de dados e busca uma categoria por id
        // e retorna um objeto pronto
        Optional<Categoria> obj = repo.findById(id);
        if(!obj.isPresent()){
              throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id
              + ",Tipo: "+ Categoria.class.getClass());
        }
        return obj;
    }

}
