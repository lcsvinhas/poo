package aula;

public class Medico {
    private String crm;
    private String nome;
    private double salario;
    private double valorConsulta;
    private static int contador = 0;

    public Medico(String crm, String nome, double salario, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
        contador++;
    }

    public void pagamentoDinheiro() {
        this.salario += this.valorConsulta;
    }

    public void pagamentoPlano() {
        this.salario += this.valorConsulta * .7;
    }

    public void exibirDados() {
        System.out.println("CRM: " + crm);
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Valor da consulta: " + valorConsulta);
        System.out.println("");
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public static int getContador() {
        return contador;
    }
}
