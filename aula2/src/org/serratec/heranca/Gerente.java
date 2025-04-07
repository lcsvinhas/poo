package org.serratec.heranca;

public class Gerente extends Empregado {
	private Integer numEmpregadoGerenciados;

	public Gerente(String nome, String email, String telefone, Integer numEmpregadoGerenciados, Double salario) {
		super(nome, email, telefone, salario);
		this.numEmpregadoGerenciados = numEmpregadoGerenciados;
	}

	public Integer getNumEmpregadoGerenciados() {
		return numEmpregadoGerenciados;
	}

	@Override
	public Double aumentarSalario(Double valor) {
		return salario = super.aumentarSalario(valor) + 1000;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNº de empregados: " + numEmpregadoGerenciados;
	}
}
