package org.serratec.testes;

import java.time.LocalDate;

import org.serratec.exemplos.Pedido;

public class TestePedido {


	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.of(2025, 02, 03), 2000., 2);

		System.out.println("Nº Pedido: " + pedido1.getNumero() + " - Total: R$" + pedido1.getTotal());
	}

}
