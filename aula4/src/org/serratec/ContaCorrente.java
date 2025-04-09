package org.serratec;

public class ContaCorrente implements Conta {
    private String titular;
    private Double saldo;
    private static Integer contadorSaque = 0;
    private static Integer contadorDeposito = 0;

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nSaldo: R$" + saldo + "\n";
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public static Integer getContadorDeposito() {
        return contadorDeposito;
    }

    public static Integer getContadorSaque() {
        return contadorSaque;
    }

    @Override
    public Boolean saque(Double valor) {
        if(saldo >= valor){
            saldo -= valor;
            contadorSaque++;
            return true;
        }
        return false;
    }

    @Override
    public void deposito(Double valor) {
        if(valor > 0){
            saldo += valor;
            contadorDeposito++;
        }else {
            System.out.println("Valor deve ser maior que zero");
        }
    }
}
