package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String responsavel;
    private List<Livro> listaLivros = new ArrayList<>();

    public String getResponsavel() {
        return responsavel;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void listar() {
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
    }

    public int pesquisarFaixaDePrecos(double valorInicial, double valorFinal) {
        int contador = 0;
        for (Livro livro : listaLivros) {
            if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularTotalLivros() {
        double total = 0;
        for (Livro livro : listaLivros) {
            total += livro.getPreco();
        }
        return total;
    }
}



