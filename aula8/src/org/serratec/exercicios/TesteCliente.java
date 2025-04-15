package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID do cliente (negativo para sair): ");
            Integer id = sc.nextInt();
            if (id < 0) {
                break;
            }
            System.out.print("Digite o nome: ");
            String nome = sc.next();
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite o telefone: ");
            String telefone = sc.next();
            clientes.add(new Cliente(id, nome, idade, telefone));
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        sc.close();
    }
}
