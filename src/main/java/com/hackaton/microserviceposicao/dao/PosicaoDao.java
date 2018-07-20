package com.hackaton.microserviceposicao.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.hackaton.microserviceposicao.model.Posicao;

public interface PosicaoDao extends MongoRepository<Posicao, Long> {

    @Query("{ 'nome' : ?0 }")
    List<Posicao> findAtivoByNome(String nome);

    List<Posicao> findBynoDocumento(Long documento);

}