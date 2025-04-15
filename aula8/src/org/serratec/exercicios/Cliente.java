package org.serratec.exercicios;

public class Cliente {
    private Integer id;
    private String nome;
    private Integer idade;
    private String telefone;

    public Cliente(Integer id, String nome, Integer idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone;
    }
}
