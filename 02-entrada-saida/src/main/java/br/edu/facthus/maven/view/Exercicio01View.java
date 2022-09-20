package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Exercicio01View {

    private Integer n1;

    private Integer n2;

    private String saida;

    public void soma() {
        Integer s = n1 + n2;

        saida = "A soma é " + s;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }
    
}
