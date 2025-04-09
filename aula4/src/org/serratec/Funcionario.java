package org.serratec;

public abstract class Funcionario {
    protected String cpf;
    protected String nome;
    protected Double salario;

    public Funcionario(String cpf, String nome, Double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nCPF: " + cpf
                + "Salário: R$" + salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    // Assinatura de método na qual os filhos terão que implementar
    public abstract void reajusteSalarial(Double valor);
}
