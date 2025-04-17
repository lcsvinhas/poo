package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteScannerData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.print("Dia: ");
        Integer dia = sc.nextInt();

        System.out.print("Mês: ");
        Integer mes = sc.nextInt();

        System.out.print("Ano: ");
        Integer ano = sc.nextInt();

        LocalDate data = LocalDate.of(ano, mes, dia);

        String dataFormatada = data.format(formatter);

        System.out.println("Data formatada: " + dataFormatada);

        sc.close();
    }
}
