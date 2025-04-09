package org.serratec;

public abstract class Imovel {
    protected String local;
    protected Double valor;
    protected Proprietario proprietario;

    public Imovel(String local, Double valor, Proprietario proprietario) {
        this.local = local;
        this.valor = valor;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Proprietário: " + proprietario
                + "\nLocal: " + local
                + "\nValor: R$" + valor;
    }

    public String getLocal() {
        return local;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public Double getValor() {
        return valor;
    }

    public Double calcularITBI(){
        return valor * .035;
    }
}
