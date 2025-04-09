package org.serratec;

public class Gerente extends Funcionario {
    private String nivel;

    public Gerente(String cpf, String nome, Double salario, String nivel) {
        super(cpf, nome, salario);
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNível: " + nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public void reajusteSalarial(Double valor) {
        this.salario += salario * valor/100;
    }
}
