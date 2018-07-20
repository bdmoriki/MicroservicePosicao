package com.hackaton.microserviceposicao.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.microserviceposicao.dao.PosicaoDao;
import com.hackaton.microserviceposicao.model.Posicao;

@Service
public class PosicaoService {

	@Autowired
	private PosicaoDao posicaoDao;
	
	public List<Posicao> consultarPosicaoPorNome(String nome) {
		 List<Posicao> listaPosicao = new ArrayList<Posicao>();
		 Iterable<Posicao> listaIterable = Collections.emptySet();

		 listaIterable = this.posicaoDao.findAtivoByNome(nome);
		 
		 if(listaIterable != null) {
			 for(Posicao posicao: listaIterable) {
				 listaPosicao.add(posicao);
		     }
		 }
		
		return this.posicaoDao.findAtivoByNome(nome);
	}

	public List<Posicao> consultarPosicaoPorDocumento(Long documento) {
		return this.posicaoDao.findBynoDocumento(documento);
	}	
	
}
