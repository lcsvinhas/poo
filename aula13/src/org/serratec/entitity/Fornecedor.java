package org.serratec.entitity;

import java.io.Serializable;

public class Fornecedor implements Serializable {
    /** Classe para criação de fornecedores
     *
     * @author Lucas
     * @since 2025
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Identifica o nome da empresa
     */
    private String nome;
    /**
     * Identificador único da empresa
     */
    private String cnpj;

    /**
     * Construtor cheio
     * @param nome
     * @param cnpj
     */
    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    /**
     * @author Admin
     * @param valor double - valor passado para pagamento do fornecedor
     * @return retorna o valor calculado do pagamento
     * @throws IllegalArgumentException - lança uma exceção para cálculos incorretos
     */
    public Double calcularPagamento(Double valor) throws IllegalArgumentException{
        return 0.0;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
