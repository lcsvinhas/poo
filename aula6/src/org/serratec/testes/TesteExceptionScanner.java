package org.serratec.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExceptionScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite uma palavra: ");
            String entrada = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

//          String maiuscula = entrada.toUpperCase();
//          System.out.println(maiuscula);
            String textoNulo = null;

            String resultado = textoNulo.toUpperCase();
            System.out.println(resultado);
        } catch (NullPointerException e) {
            System.out.println("Erro!");
        } catch (InputMismatchException e) {
            System.out.println("Caracter inválido!");
        } finally {
            scanner.close();
        }
    }
}
