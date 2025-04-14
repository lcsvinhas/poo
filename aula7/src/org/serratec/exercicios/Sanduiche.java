package org.serratec.exercicios;

public enum Sanduiche {
    XTUDO("hambúrguer", 12.), BOURBON("hambúrguer artesanal", 30.), DOGAO("cachorro quente", 12.);

    private String tipo;
    private Double valor;

    Sanduiche(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }
}
