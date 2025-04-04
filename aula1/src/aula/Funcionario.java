package aula;

import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double calcularInss() {
		return this.salario * .11;
	}

	public double calcularValeTransporte() {
		return this.salario * .06;
	}

	public void exibirDados() {
        String mensagem = "Nome: " + nome +
		        		  "\nSalário: R$" + salario +
		                  "\nINSS: R$" + calcularInss() +
		                  "\nVale transporte: R$" + calcularValeTransporte() +
		                  "\nSalário líquido: R$" + (salario - (calcularInss() + calcularValeTransporte()));

        JOptionPane.showMessageDialog(null, mensagem, "Dados do Funcionário", JOptionPane.INFORMATION_MESSAGE);
    }

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

}