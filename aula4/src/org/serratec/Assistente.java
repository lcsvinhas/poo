package org.serratec;

public class Assistente extends Funcionario{
    protected Double adicional;

    public Assistente(String cpf, String nome, Double salario, Double adicional) {
        super(cpf, nome, salario);
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAdicional: R$" + adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    @Override
    public void reajusteSalarial(Double valor) {
        this.salario += salario * (valor/100 + adicional);
    }
}
