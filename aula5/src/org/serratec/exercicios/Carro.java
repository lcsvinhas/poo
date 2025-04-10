package org.serratec.exercicios;

import java.time.LocalDate;

public class Carro extends Veiculo {
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public Double lavarVeiculos() {
        return super.lavarVeiculos();
    }

    @Override
    public Double trocarOleo() {
        if (this.dataConserto.getDayOfWeek().getValue() == 6) {
            return this.valorCobrado += TipoServico.OLEO.getValorPorServico() - 50;
        } else {
            return super.trocarOleo();
        }
    }

    @Override
    public Double revisao() {
        if (this.dataConserto.getMonth().getValue() == 8) {
            return this.valorCobrado += TipoServico.REVISAO.getValorPorServico() * .9;
        } else {
            return super.revisao();
        }
    }
}
