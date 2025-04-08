package org.serratec.exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Fixo vendedor1 = new Fixo("Joana","112.458.245-89",2500.,10);
        Fixo vendedor2 = new Fixo("Maria","154.356.254-55",3000.,10);

        Scanner scan = new Scanner(System.in);

        double totalVendas = 0.;

        while(true) {
            System.out.println("-------Sistema de Vendas-------" + "\nVendedores:");
            System.out.println("1 - " + vendedor1.getNome() + "\n2 - " + vendedor2.getNome());

            System.out.print("Escolha um vendedor: ");
            int opcao = scan.nextInt();

            System.out.print("Digite o valor da venda: R$");
            double valor = scan.nextDouble();
            totalVendas += valor;

            if (opcao == 1) {
                vendedor1.calcularSalario(valor);
            } else if (opcao == 2) {
                vendedor2.calcularSalario(valor);
            }else {
                System.out.println("Escolha 1 ou 2");
            }

            System.out.print("Deseja encerrar o programa? (s/n) ");
            String resposta = scan.next();

            if (resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("-------Salários dos vendedores-------");
        System.out.println(vendedor1);
        System.out.println(vendedor2);

        System.out.println("-------Total vendido-------");
        System.out.println("R$" + totalVendas);

    }
}
