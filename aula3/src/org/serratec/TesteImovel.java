package org.serratec;

public class TesteImovel {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("André");
        Proprietario p2 = new Proprietario("Adriana");

        Imovel imovel1 = new Imovel("Casa", 90000., p1);

        System.out.println(imovel1);
    }
}
