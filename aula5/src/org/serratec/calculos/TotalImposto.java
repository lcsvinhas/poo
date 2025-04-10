package org.serratec.calculos;

import org.serratec.exemplos.Tributos;

public class TotalImposto {
    private Double totalGeral = 0.0;

    public Double getTotalGeral() {
        return totalGeral;
    }

    public void calcularTotalGeralTributos(Tributos tributos) {
        totalGeral += tributos.calcularICMS();
        totalGeral += tributos.calcularIR();
        System.out.println("Total geral ICMS: R$" + tributos.calcularICMS());
        System.out.println("Total geral IR: R$" + tributos.calcularIR());
    }
}
