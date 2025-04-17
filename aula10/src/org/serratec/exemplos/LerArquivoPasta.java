package org.serratec.exemplos;

import java.io.File;
import java.util.Scanner;

public class LerArquivoPasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho da pasta ou nome do arquivo: ");
        String nome = sc.nextLine();

        File file = new File(nome);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.printf("\nArquivo %s existe - tamanho: %d bytes", file.getName(), file.length());
            } else {
                System.out.println("\nConteúdo da pasta: ");
                for (File arquivo : file.listFiles()) {
                    System.out.println(arquivo);
                }
            }
        } else {
            System.out.println("Arquivo não encontrado");
        }
        sc.close();
    }
}
