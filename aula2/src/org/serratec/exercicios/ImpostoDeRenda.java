package org.serratec.exercicios;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected Double rendimentos;

	public ImpostoDeRenda(String nome, Double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
}