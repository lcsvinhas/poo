package org.serratec.exemplos;

import java.util.Map;
import java.util.TreeMap;

public class TesteEstado {
    public static void main(String[] args) {

        TreeMap<String, String> estados = new TreeMap<>();
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("AC", "Acre");

        for (String key : estados.keySet()) {
            System.out.println(estados.get(key));
        }

        for (String valor : estados.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<String, String> dados : estados.entrySet()){
            System.out.println(dados);
        }
    }
}
