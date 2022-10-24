package br.edu.facthus.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;

@Singleton
public class TestSingletonService {

    @PostConstruct
    public void init() {
        System.out.println("Criando EJB: " + this);
    }

    public String m() {
        return String.valueOf(this);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destruindo EJB: " + this);
    }
 
}
