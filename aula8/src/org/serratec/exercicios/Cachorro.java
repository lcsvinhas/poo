package org.serratec.exercicios;

public class Cachorro extends AnimalDeEstimacao {
    String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void imprimir() {
        System.out.println(nome + " " + idade + " " + raca);
    }
}