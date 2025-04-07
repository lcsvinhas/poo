package aula;

public class Produto {
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double calcularIcms() {
        return (valor * quantidade) * .12;
    }

    public void exibirDados() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("ICMS: R$" + calcularIcms());
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}