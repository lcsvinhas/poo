package exercicios;

public class Pessoa {
	// Modificador de acesso padrão
	private int id;
	private String nome;
	// Tipo primitivo - armazenam valores
	private double peso, altura;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		} else {
			System.out.println("Você digitou um valor inválido!");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}

	public String resultado() {
		// Se o resultado for < 18.5 - Abaixo do peso
		// Se o resultado for entre 18.5 e 24.9 - Peso ideal
		// Acima do peso

		if (calcularIMC() < 18.5) {
			return "abaixo do peso";
		} else if (calcularIMC() <= 24.9) {
			return "peso ideal";
		} else {
			return "acima do peso";
		}
	}
}
