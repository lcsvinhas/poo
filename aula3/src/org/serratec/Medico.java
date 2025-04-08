package org.serratec;

public class Medico {
    protected String crm;
    protected String nome;
    protected Double salario;

    public Medico(String nome, String crm, Double salario) {
        this.nome = nome;
        this.crm = crm;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCRM: " + crm +
                "\nSalário: R$" + salario + "\n";
    }

    public String getCrm() {
        return crm;
    }

    public Double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salario += salario * 1.05;
    }

    //Overload
    public double calcularSalario(Double valor) {
        return salario += salario * valor / 100;
    }
}
