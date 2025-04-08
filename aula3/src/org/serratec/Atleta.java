package org.serratec;

public class Atleta {
    private String nome;
    private Integer idade;

    @Override
    public String toString() {
        return "Nome: " + nome + " - Idade: " + idade;
    }

    public Atleta(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

}
