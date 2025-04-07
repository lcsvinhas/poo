package org.serratec.exercicios;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "-=-=- Gerente -=-=-"
                +"\nNome: " + nome
                +"\nSalário: R$" + salario
                +"\nSetor: " + setor + "\n";
    }

    @Override
    public void aumentarSalario() {
        super.aumentarSalario();
        this.salario += 200;

    }
}
