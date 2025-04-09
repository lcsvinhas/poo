package org.serratec;

public interface Conta {
    public static final Double taxas = 10.;

    public Boolean saque(Double valor);
    public void deposito(Double valor);
}
