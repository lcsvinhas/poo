package org.serratec.exercicios;

import java.time.LocalDate;

public class Pedido {
    private LocalDate dataPedido;
    private Bebida bebida;
    private Sanduiche sanduiche;

    public Pedido(Bebida bebida, Sanduiche sanduiche) {
        this.dataPedido = LocalDate.now();
        this.bebida = bebida;
        this.sanduiche = sanduiche;
    }

    @Override
    public String toString() {
        return "Pedido: " + bebida.getTipo() + " & " + sanduiche.getTipo() + "\n"
                + "Valor: R$" + (bebida.getValor() + sanduiche.getValor()) + "\n";
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }

    public static void exibirCardapio() {
        System.out.println("-=-=-CARDÁPIO-=-=-");
        System.out.println("Sanduíches:");
        for (Sanduiche sanduiche : Sanduiche.values()) {
            System.out.println(sanduiche + " - R$" + sanduiche.getValor());
        }
        System.out.println("Bebidas:");
        for (Bebida bebida : Bebida.values()) {
            System.out.println(bebida + " - R$" + bebida.getValor());
        }
    }

    public Double calcularPedido() {
        return bebida.getValor() + sanduiche.getValor();
    }
}
