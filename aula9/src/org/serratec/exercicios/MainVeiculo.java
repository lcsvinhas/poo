package org.serratec.exercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class MainVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Veiculo> veiculos = new TreeMap<>();

        while (true) {
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Procurar veículo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            Integer opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca do veículo: ");
                    String marca = sc.next();

                    System.out.print("Digite o modelo: ");
                    String modelo = sc.next();

                    System.out.print("Digite o ano: ");
                    Integer ano = sc.nextInt();

                    System.out.print("Digite a placa: ");
                    String placa = sc.next();

                    Veiculo veiculo = new Veiculo(marca, modelo, ano);
                    veiculos.put(placa, veiculo);

                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a placa: ");
                    String busca = sc.next();

                    if (veiculos.containsKey(busca)) {
                        Veiculo encontrado = veiculos.get(busca);
                        System.out.println("Veículo encontrado: " + encontrado);
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
