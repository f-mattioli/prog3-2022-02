package br.edu.facthus.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.entity.Contato;
import br.edu.facthus.entity.Telefone;

@Stateless
public class ContatosService {

    @PersistenceContext
    private EntityManager entityManager;

    public void cadastra(Contato contato) {
        entityManager.persist(contato);
        System.out.println("Contato inserido com sucesso!");
    }

    public List<Contato> lista() {
        return entityManager
            .createNamedQuery("Contato.findAll", Contato.class)
            .getResultList();
    }

    public List<Contato> buscaPorNome(String nome) {
        return entityManager
            .createNamedQuery("Contato.findByNome", Contato.class)
            .setParameter("nome", "%" + nome.toUpperCase() + "%")
            .getResultList();
    }

    public void cadastraTelefone(Telefone telefone) {
        entityManager.persist(telefone);
    }
    
}
