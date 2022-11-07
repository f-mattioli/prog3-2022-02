package br.edu.facthus.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.entity.Contato;
import br.edu.facthus.entity.Telefone;
import br.edu.facthus.service.ContatosService;

@Named
@ViewScoped
public class IndexView implements Serializable {
	
	@Inject
	private ContatosService contatosService;

	private Contato contato = new Contato();

	private Contato contatoSelecionado;
	
	private List<Contato> contatos = new ArrayList<>();

	private String numeroTelefone;

	public void cadastra() {
		contatosService.cadastra(contato);
	}

	public void lista() {
		contatos = contatosService.lista();
	}

	public void detalhes(Contato contato) {
		System.out.println("Index View: " + contato.getId());
		contatoSelecionado = contato;
	}

	public void edita(Contato contato) {
		System.out.println("Edita: em construção...");
	}

	public void acrescentaTelefone() {
		Telefone telefone = new Telefone();
		telefone.setContato(contatoSelecionado);
		telefone.setNumero(numeroTelefone);

		contatosService.cadastraTelefone(telefone);
		System.out.println("Telefone cadastrado com sucesso!");
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Contato getContatoSelecionado() {
		return contatoSelecionado;
	}

	public void setContatoSelecionado(Contato contatoSelecionado) {
		this.contatoSelecionado = contatoSelecionado;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	
}
