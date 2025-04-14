package org.serratec.exercicios;

public enum Bebida {
    COCA_COLA("refrigerante", 7.), HEINEKEN("cerveja", 12.), DEL_VALLE("suco", 6.);

    private String tipo;
    private Double valor;

    Bebida(String tipo, Double valor) {
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
