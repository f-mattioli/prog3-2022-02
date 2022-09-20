package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Exercicio02bView {

    private Integer n1;

    private Integer n2;

    private String saida;

    private String operacao;

    public void calcula() {
        switch (operacao) {
            case "soma":
                saida = "A soma é " + (n1 + n2);
                break;
            case "sub":
                saida = "A diferença é " + (n1 - n2);
                break;
            case "mult":
                saida = "O produto é " + (n1 * n2);
                break;
            case "div":
                saida = "O quociente é " + (n1 / n2);
                break;
            default:
                saida = "Operação inválida!";
        }
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

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
}
