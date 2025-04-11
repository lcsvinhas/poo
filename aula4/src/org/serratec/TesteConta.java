package org.serratec;

import org.serratec.exception.ContaCorrenteException;

public class TesteConta implements Conta {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Marcos", 1000.0);
        ContaCorrente cc2 = new ContaCorrente("Ana", 2000.0);

        try {
            cc1.deposito(1000.0);
            cc2.saque(1000.0);
        } catch (ContaCorrenteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(cc1);
            System.out.println(cc2);
            System.out.println("Total de saques: " + (cc1.getContadorSaque() + cc2.getContadorSaque()));
            System.out.println("Total de depósitos: " + (cc1.getContadorDeposito() + cc2.getContadorDeposito()));
        }
    }

    @Override
    public Boolean saque(Double valor) {
        return null;
    }

    @Override
    public void deposito(Double valor) {

    }
}
