package org.serratec.exemplos;

//Final na classe não pode ter filhos
public final class Policial {
    protected String nome;
//  protected final String LOTACAO = "Brasília";
    protected final String LOTACAO;

    public Policial(String nome, String LOTACAO) {
        this.nome = nome;
        this.LOTACAO = LOTACAO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLOTACAO() {
        return LOTACAO;
    }

    //  Não pode ser sobrescrito
    public final void imprimir(){
        System.out.println("Dados do policial!");
    }
}
