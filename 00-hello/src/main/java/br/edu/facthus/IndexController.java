package br.edu.facthus;

import javax.inject.Named;

@Named
public class IndexController {

	public String getMessage() {
		return "Olá Java EE!";
	}
	
}
