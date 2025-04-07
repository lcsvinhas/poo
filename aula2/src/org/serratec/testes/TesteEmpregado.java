package org.serratec.testes;

import org.serratec.heranca.Diretor;
import org.serratec.heranca.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Carla", "c@gmail.com", "2222", 10, 5500.);
		Diretor diretor = new Diretor("Carlos", "ca@gmail.com", "233", 9000., "ADM");

		System.out.println(gerente.getNome() + " - " + gerente.getEmail());
		System.out.println(gerente.getNumEmpregadoGerenciados());
		
		gerente.aumentarSalario(10.);
		diretor.aumentarSalario(10.);

		System.out.println("Novo salário: R$" + gerente.getSalario());
		System.out.println("Novo salário: R$" + diretor.getSalario());
		
		System.out.println(gerente.toString());
		System.out.println(diretor.toString());

	}
}