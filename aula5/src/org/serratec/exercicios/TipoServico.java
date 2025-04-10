package org.serratec.exercicios;

public enum TipoServico {
    OLEO(100.), LAVAGEM(50.), REVISAO(200.);

    private Double ValorPorServico;

    TipoServico(Double valorPorServico) {
        ValorPorServico = valorPorServico;
    }

    public Double getValorPorServico() {
        return ValorPorServico;
    }
}
