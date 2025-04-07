package org.serratec.testes;

import org.serratec.exercicios.Assistente;
import org.serratec.exercicios.Funcionario;
import org.serratec.exercicios.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Lucas", 3500);
        Assistente a1 = new Assistente("Maria", 1500., 200);
        Gerente g1 = new Gerente("Selma", 7800., "Vendas");

        System.out.println(f1);
        System.out.println(a1);
        System.out.println(g1);
    }
}
