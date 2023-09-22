package br.edu.ifsp.arq.dw2s6.spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {

	@Autowired
	@Qualifier("impressoraHP")
	private Impressora impressora;

	public void finalizar() {
		// regras do negócio
		
		impressora.imprimir("Compra 1");
	}
}
