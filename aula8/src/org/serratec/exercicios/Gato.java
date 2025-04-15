package org.serratec.exercicios;

public class Gato extends AnimalDeEstimacao {
    String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public void imprimir() {
        System.out.println(nome + " " + idade + " " + cor);
    }
}