package org.serratec.exercicios;

public class Atleta {
    private String nome;
    private Double altura;

    public Atleta(String nome, Double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Altura: " + altura;
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }
}
