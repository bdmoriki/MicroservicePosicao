package com.hackaton.microserviceposicao.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.microserviceposicao.model.Posicao;
import com.hackaton.microserviceposicao.service.PosicaoService;

@RestController
@RequestMapping(
		path = "/api/v1/saldo"
		)
public class PosicaoResource {
	
	@Autowired
	private PosicaoService posicaoService;

	@RequestMapping(
	path="/consulta_saldo",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Posicao> consultarSaldo(@RequestParam("nome") String nome) {
		return this.posicaoService.consultarPosicaoPorNome(nome);
	}

	@RequestMapping(
	path="/consulta_saldo_documento/{documento}",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Posicao> consultarSaldoDocumento(@PathVariable("documento") Long documento) {
		return this.posicaoService.consultarPosicaoPorDocumento(documento);
	}

}
