package org.serratec.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List<String> times = new ArrayList<>();

        times.add("Flamengo");
        times.add("Vasco");
        times.add("Fluminense");
        times.add("Botafogo");
        times.set(3, "Bangu");

//        System.out.println("A lista está vazia? " + (times.isEmpty() ? "Sim" : "Não"));
//        System.out.println("A lista tem Botafogo? " + (times.contains("Botafogo") ? "Sim" : "Não"));
//        System.out.println("Quantos elementos tem na lista? " + times.size());
//
//        Collections.sort(times);
//
//        for (String time : times) {
//            System.out.println(time);
//        }

        Aluno a1 = new Aluno("Marcos", 40, "asasfas@as");
        Aluno a2 = new Aluno("Adriano", 20, "as@as");
        Aluno a3 = new Aluno("José", 20, "as@as");

        List<Aluno> alunos = Arrays.asList(a1, a2, null);
        alunos.set(0, a3);

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("*************OF**************");
        List<Aluno> alunoOf = List.of(a1, a2, null);
        alunoOf.set(0, a3);
        System.out.println(alunoOf);
    }
}
