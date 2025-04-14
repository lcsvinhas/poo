package org.serratec.exercicios;

public class TestePedido {
    public static void main(String[] args) {
        Pedido.exibirCardapio();

        Pedido p1 = new Pedido(Bebida.HEINEKEN,Sanduiche.DOGAO);
        Pedido p2 = new Pedido(Bebida.DEL_VALLE,Sanduiche.BOURBON);

        p1.calcularPedido();
        p2.calcularPedido();

        System.out.println(p1);
        System.out.println(p2);

    }
}
