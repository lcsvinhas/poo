package org.serratec;

public class Time {
    private String nome;
    private String tecnico;
    private Atleta[] atletas;

    public Time(String nome, String tecnico, Atleta[] atletas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = atletas;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void adicionarAtleta(Atleta atleta) {
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i] == null)
                atletas[i] = atleta;
                break;
        }
    }

    public void imprimirElenco() {
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
        }
    }
}
