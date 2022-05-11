package com.mjv.aguaLuz.notification.App;

import java.time.LocalDateTime;

import com.mjv.aguaLuz.notification.model.Cadastro;
import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.model.Endereco;
import com.mjv.aguaLuz.notification.service.GeradorMensagem;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022,2,21,16,0));
		contrato.setNumProtocolo(23242424L);
		contrato.setServico("Agua");
		contrato.setValor(127.33);
		
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		
		cliente.setCpf("03124742370");
		cliente.setNome("Gleyson Sampaio");
		
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("centro");
		endereco.setLogradouro("Rua das Marias");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setComplemento("Bloco C");
		endereco.setNumero("243");
		endereco.setCep("27310657");
		

		
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
		
		
	}

}
