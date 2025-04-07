package aula;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Produto: ");
			String descricao = scanner.nextLine();

			System.out.print("Valor: ");
			double valor = scanner.nextDouble();

			System.out.print("Quantidade: ");
			int quantidade = scanner.nextInt();
			scanner.nextLine();

			Produto produto = new Produto(descricao, valor, quantidade);
			produto.exibirDados();

			System.out.println();
			System.out.print("Deseja cadastrar outro produto? (S/N): ");
			String continuar = scanner.nextLine().toUpperCase();
			System.out.println();

			if (continuar.equals("N")) {
				break;
			}
		}

		System.out.println("Programa encerrado.");
		scanner.close();
	}
}