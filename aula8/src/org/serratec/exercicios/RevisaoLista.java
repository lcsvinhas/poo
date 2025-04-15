package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevisaoLista {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Branco");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.set(0, 15);

        List<String> times = List.of("Flamengo", "Vasco", "Botafogo", "Fluminense");
    }
}
