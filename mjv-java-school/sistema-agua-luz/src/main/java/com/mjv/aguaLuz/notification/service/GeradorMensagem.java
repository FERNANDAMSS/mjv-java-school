package com.mjv.aguaLuz.notification.service;

import com.mjv.aguaLuz.notification.model.Cadastro;
import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente(); 
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		sb.append(" Senhor(a) " + cliente.getNome() + " cpf de numero " + cpfFormatado);
		
		System.out.print(sb.toString());
		
	}

}
