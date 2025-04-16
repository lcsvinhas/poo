package org.serratec.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Matriz {
    public static void main(String[] args) {
        String[][] clientes = {
                { "123", "Marcos", "m@gmail.com" },
                { "143", "Carla", "c@gmail.com" },
                { "125", "Amarildo", "a@gmail.com" }
        };

        Map<String, String[]> mapaClientes = new HashMap<>();

        for (String[] cliente : clientes) {
            mapaClientes.put(cliente[0], cliente);
        }

        for (Map.Entry<String, String[]> dados : mapaClientes.entrySet()) {
            String cpf = dados.getKey();
            String[] info = dados.getValue();
            System.out.println("CPF: " + cpf);
            System.out.println("Nome: " + info[1]);
            System.out.println("Email: " + info[2] + "\n");
        }
    }
}
