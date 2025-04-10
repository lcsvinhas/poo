package org.serratec.exercicios;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
    protected String modelo;
    protected Double valorCobrado = 0.;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Nome: " + proprietario.getNome()
                + "\nModelo: " + modelo
                + "\nValor cobrado: R$" + valorCobrado + "\n";
    }

    public Double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public Double lavarVeiculos() {
        return this.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public Double trocarOleo() {
        return this.valorCobrado += TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public Double revisao() {
        return this.valorCobrado += TipoServico.REVISAO.getValorPorServico();
    }
}
