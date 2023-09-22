package br.edu.ifsp.arq.dw2s6.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Checkout checkout = context.getBean(Checkout.class);
		checkout.finalizar();
		((ConfigurableApplicationContext)context).close();
	}

}
