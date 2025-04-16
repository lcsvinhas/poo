package org.serratec.exemplos;

public class TesteSorteio {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas",26);
        Aluno aluno2 = new Aluno("Pedro",27);
        Aluno aluno3 = new Aluno("Beatriz",28);

        Sorteio<Aluno> sortear = new Sorteio<>();

        sortear.adicionar(aluno1);
        sortear.adicionar(aluno2);
        sortear.adicionar(aluno3);

        System.out.println(sortear.sorteio());

        Sorteio<Integer> sortearNumeros = new Sorteio<>();

        sortearNumeros.adicionarVarios(10,54,28,65,45,25);

        System.out.println(sortearNumeros.sorteio());
    }
}
