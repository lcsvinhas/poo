package org.serratec.heranca;

public class Empregado {
	private String nome;
	private String email;
	private String telefone;
	protected Double salario;

	public Empregado(String nome, String email, String telefone, Double salario) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double aumentarSalario(Double valor) {
		return salario += salario * valor / 100;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nEmail: " + email + "\nSalário: " + salario;
	}

}
