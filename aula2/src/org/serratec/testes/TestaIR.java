package org.serratec.testes;

import org.serratec.exercicios.PessoaFisica;
import org.serratec.exercicios.PessoaJuridica;

public class TestaIR {

	public static void main(String[] args) {
		PessoaFisica pessoa1 = new PessoaFisica("Lucas", 50000., "321.654.456-52", "22.545.626-8");
		PessoaJuridica pessoa2 = new PessoaJuridica("André", 97000., "541.654.469-16", "45.658.422-7");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
	}
}