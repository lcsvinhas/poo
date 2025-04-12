package org.serratec.exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Adicionar livro"
                    + "\n2 - Listar todos os livros"
                    + "\n3 - Pesquisar por faixa de preço"
                    + "\n4 - Calcular o total"
                    + "\n5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.print("Título: ");
                String titulo = scan.next();
                scan.nextLine();
                System.out.print("Autor: ");
                String autor = scan.next();
                System.out.print("Preço: ");
                Double preco = scan.nextDouble();
                Livro livro = new Livro(titulo, autor, preco);
                biblioteca.adicionarLivro(livro);
            } else if (opcao == 2) {
                biblioteca.listar();
            } else if (opcao == 3) {
                System.out.print("Valor inicial: R$");
                double valorInicial = scan.nextDouble();
                System.out.print("Valor final: R$");
                double valorFinal = scan.nextDouble();
                int encontrados = (int) biblioteca.pesquisarFaixaDePrecos(valorInicial, valorFinal);
                System.out.println("Total encontrado: " + encontrados);
            } else if (opcao == 4) {
                double total = biblioteca.calcularTotalLivros();
                System.out.printf("Valor total dos livros: R$ %.2f%n", total);
            } else {
                break;
            }
        }
        scan.close();
    }
}
