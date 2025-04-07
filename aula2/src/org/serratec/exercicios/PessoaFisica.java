package org.serratec.exercicios;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, Double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public double calculoIR() {
		return rendimentos * .12;
	}

	@Override
	public String toString() {
		return 	"-=-=- Pessoa Física -=-=-"
				+ "\nNome: " + nome 
				+ "\nRendimentos: R$" + rendimentos 
				+ "\nCPF: " + cpf 
				+ "\nRG: " + rg + "\n";
	}
}