package com.hackaton.microserviceposicao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posicaoFinanceira")
public class Posicao {
			
	@Id
	private String id_cliente;
	
	private String nome;
	
	private Long noDocumento;
	
	private Double saldo;

	public Posicao() {
		
	}

	public Posicao(String id_cliente, String nome, Long noDocumento, Double saldo) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.noDocumento = noDocumento;
		this.saldo = saldo;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getNoDocumento() {
		return noDocumento;
	}

	public void setNoDocumento(Long noDocumento) {
		this.noDocumento = noDocumento;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
}