package org.serratec.exercicios;

public class TesteAtleta {
    public static void main(String[] args) {
        Time time = new Time("Serratec");
        Atleta a1 = new Atleta("Lucas", 1.78);
        Atleta a2 = new Atleta("Roni", 1.80);
        Atleta a3 = new Atleta("José", 1.90);

        time.adicionarAtleta(a1);
        time.adicionarAtleta(a2);
        time.adicionarAtleta(a3);

        for (Atleta atleta: time.getAtletas()){
            System.out.println(atleta);
        }
    }
}
