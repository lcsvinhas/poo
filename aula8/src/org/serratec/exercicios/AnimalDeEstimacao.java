package org.serratec.exercicios;

public abstract class AnimalDeEstimacao implements Animal {

    String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public AnimalDeEstimacao(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;

    }

    public void imprimir() {
        System.out.println(nome + " " + idade);
    }
}