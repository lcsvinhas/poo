package org.serratec.exercicios;

import java.time.LocalDate;

public class Moto extends Veiculo {
    private Integer cilindradas;

    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
        super(modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }
}
