package org.serratec;

public class TesteImovel {

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Ana");
        Casa casa = new Casa("Centro", 200000., p1, true);

        System.out.println("Valor do ITBI: R$" + casa.calcularITBI());
        System.out.println(casa);
    }
}
