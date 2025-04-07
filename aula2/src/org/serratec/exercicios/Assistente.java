package org.serratec.exercicios;

public class Assistente extends Funcionario {
    private double adicional;

    public Assistente(String nome, double salario, double adicional) {
        super(nome, salario);
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return "-=-=- Assistente -=-=-"
                +"\nNome: " + nome
                +"\nSalário: R$" + salario
                +"\nAdicional: R$" + adicional
                + "\nSalário Final: R$" + (salario + adicional) + "\n";
    }

    @Override
    public void aumentarSalario() {
        super.aumentarSalario();
        salario += adicional;
    }
}
