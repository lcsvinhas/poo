package org.serratec.exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
        //Não permite elementos iguais
        //Maior para menor
        //Set<String> times = new HashSet<>();
        //Mantém a ordem da inserção
        //Set<String> times = new LinkedHashSet<>();
        //Ordena os elementos
        Set<String> times = new TreeSet<>();
        Set<Integer> numeros = new HashSet<>();
        numeros.add(20);
        numeros.add(20);
        numeros.add(30);

        times.add("Flamengo");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Fluminense");
        times.add("Botafogo");
        times.add("Flamengo");

        for (String time : times) {
            System.out.println(time);
        }

        for (Integer n : numeros) {
            System.out.println(n);
        }

    }
}
