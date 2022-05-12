package com.mjv.pedidofest.app;

import com.mjv.pedidofest.model.cadastro.Cliente;
import com.mjv.pedidofest.repository.ClienteJDBCRepository;

public class ClienteCadastroApp {
	public static void main(String[] args) {
		//SCANNER
		//INTERFACE GRAFICO DO SISTEMA
		//APP - API REST
		
		Cliente gleyson = new Cliente();
		gleyson.setCpf("68678");
		gleyson.setNome("GLEYSON SAMPAIO");
		gleyson.setWhatsapp(118978898L);
		

		ClienteJDBCRepository repository = new ClienteJDBCRepository();
		repository.incluir(gleyson);
		
	}
}
