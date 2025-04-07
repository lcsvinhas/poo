package org.serratec.exercicios;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String turno;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "-=-=- Funcionário -=-=-"
                +"\nNome: " + nome
                +"\nSalário: R$" + salario + "\n";
    }

    public void aumentarSalario() {
        this.salario += this.salario * 0.02;
    }

}
