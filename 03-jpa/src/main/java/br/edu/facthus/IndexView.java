package br.edu.facthus;

import javax.inject.Named;

import br.edu.facthus.entity.Contato;

@Named
public class IndexView {

	private Contato contato = new Contato();

	public void cadastra() {
		System.out.println("Em construção...");
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
