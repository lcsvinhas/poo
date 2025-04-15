package org.serratec.exercicios;

public class TesteAnimal {

    public static void main(String[] args) {

        Loja loja = new Loja("Pet Life");

        loja.adicionarAnimal(new Cachorro("Bolt", 4, "São Bernardo"));
        loja.adicionarAnimal(new Gato("Ranzinza", 7, "Rajado"));

        loja.listarAnimais();

        try {
            loja.adotarAnimal(2);
            loja.listarAnimais();
        } catch (AnimalException a) {
            System.out.println("Animal inexistente.");
        }
    }
}