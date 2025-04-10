package org.serratec.exercicios;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("Lucas");
        Proprietario proprietario2 = new Proprietario("Marcos");
        Carro carro = new Carro("HB20", LocalDate.of(2025, 4, 12), proprietario1, "Sedan");
        Moto moto = new Moto("XRE-300", LocalDate.of(2025, 2, 20), proprietario2, 300);

        carro.trocarOleo();
        carro.revisao();

        moto.lavarVeiculos();

        System.out.println(carro);
        System.out.println(moto);
    }
}
