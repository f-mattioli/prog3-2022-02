package br.edu.facthus;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.service.TestSingletonService;
import br.edu.facthus.service.TestStatefulService;
import br.edu.facthus.service.TestStatelessService;

@Named
@ViewScoped
public class IndexView implements Serializable {

	@Inject
	private TestSingletonService service;

	private String mensagem;
	
	public void click() {
		mensagem = service.m();
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
