package org.serratec;

public class Apto extends Imovel {
    private Integer andar;

    public Apto(String local, Double valor, Proprietario proprietario, Integer andar) {
        super(local, valor, proprietario);
        this.andar = andar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAndar: " + andar;
    }

    public Integer getAndar() {
        return andar;
    }
}
