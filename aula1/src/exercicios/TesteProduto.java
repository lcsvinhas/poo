package exercicios;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Scanner sc = new Scanner(System.in);
		// Construtor Default - implícito
		Produto p2 = new Produto();

		System.out.print("Descrição: ");
		String descricao = sc.next();
		System.out.print("Valor: ");
		double valor = sc.nextDouble();

		p1.setDescricao(descricao);
		p1.setValor(valor);

		System.out.println(p1.getDescricao() + " - R$" + p1.getValor());

	}

}
