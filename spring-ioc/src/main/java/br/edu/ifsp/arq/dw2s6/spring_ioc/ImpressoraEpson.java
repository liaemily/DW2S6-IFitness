package br.edu.ifsp.arq.dw2s6.spring_ioc;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(String documento) {
		System.out.println("Imprimindo na Epson: " + documento);		
	}

}
