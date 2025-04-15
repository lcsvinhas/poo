package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    String nomeLoja;
    List<Animal> animais = new ArrayList<>();

    public Loja(String nomeLoja) {
        super();
        this.nomeLoja = nomeLoja;
        this.animais = animais;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            animal.imprimir();
        }
    }

    public void adotarAnimal(int index) throws AnimalException {
        if (index - 1 >= 0 || index - 1 < animais.size()) {
            animais.remove(index - 1);
            System.out.println("Você adotou um Pet!!");
        }
    }
}