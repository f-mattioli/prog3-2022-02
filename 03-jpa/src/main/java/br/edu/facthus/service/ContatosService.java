package br.edu.facthus.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ContatosService {

    @PersistenceContext
    private EntityManager entityManager;


    
}
