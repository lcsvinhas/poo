package org.serratec;

public class TesteConta implements Conta {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Marcos", 1000.0);
        ContaCorrente cc2 = new ContaCorrente("Ana", 2000.0);

        cc1.deposito(1000.0);
        cc2.saque(1000.0);

        System.out.println(cc1);
        System.out.println(cc2);

        System.out.println("Total de saques: " + (cc1.getContadorSaque() + cc2.getContadorSaque()));
        System.out.println("Total de depósitos: " + (cc1.getContadorDeposito() + cc2.getContadorDeposito()));
    }

    @Override
    public Boolean saque(Double valor) {
        return null;
    }

    @Override
    public void deposito(Double valor) {

    }
}
