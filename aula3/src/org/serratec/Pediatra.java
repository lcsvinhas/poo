package org.serratec;

public class Pediatra extends Medico {
    private String especializacao;

    public Pediatra(String nome, String crm, Double salario, String especializacao) {
        super(nome, crm, salario);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "Especialização: " + especializacao;
    }

    @Override
    public double calcularSalario() {
        return salario += salario * 1.15;
    }
}
