package org.serratec;

public class Imovel {
    private String tipo;
    private Double valor;
    private Proprietario proprietario;

    public Imovel(String tipo, Double valor, Proprietario proprietario) {
        this.proprietario = proprietario;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo
                + "\nValor: R$" + valor
                + "\nProprietário: " + proprietario + "\n";
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }
}
