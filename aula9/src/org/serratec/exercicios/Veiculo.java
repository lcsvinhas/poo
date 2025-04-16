package org.serratec.exercicios;

public class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }
}
