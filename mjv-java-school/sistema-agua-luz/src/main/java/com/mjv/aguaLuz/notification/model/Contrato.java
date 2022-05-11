package com.mjv.aguaLuz.notification.model;

import java.time.LocalDateTime;

public class Contrato {
	private Long numProtocolo;
	private Cadastro cliente;
	private String servico; 
	private Double valor;
	private LocalDateTime dataHora;
	public Long getNumProtocolo() {
		return numProtocolo;
	}
	public void setNumProtocolo(Long numProtocolo) {
		this.numProtocolo = numProtocolo;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	

	
	
	

}
