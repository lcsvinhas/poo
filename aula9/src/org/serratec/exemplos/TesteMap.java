package org.serratec.exemplos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
    public static void main(String[] args) {

        TreeMap<Aluno, Integer> mapa2 = new TreeMap<>();
        mapa2.put(new Aluno("Maria",25), 1000);
        mapa2.put(new Aluno("Joao",25), 2000);
        mapa2.put(new Aluno("Maria",25), 3000);

        System.out.println(mapa2);

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(2, "Vitor");
        mapa.put(1, "Roni");
        mapa.put(3, "João");

        System.out.println(mapa);
    }
}
