package org.serratec.exercicios;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj;
	private String inscEstadual;

	public PessoaJuridica(String nome, Double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	public double calculoIR() {
		return rendimentos * .15;
	}
	
	@Override
	public String toString() {
		return 	"-=-=- Pessoa Jurídica -=-=-"
				+ "\nNome: " + nome 
				+ "\nRendimentos: R$" + rendimentos 
				+ "\nCNPJ: " + cnpj 
				+ "\nInscrição Estadual: " + inscEstadual + "\n";
	}
}