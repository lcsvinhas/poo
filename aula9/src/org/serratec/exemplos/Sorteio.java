package org.serratec.exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {
    private List<T> lista;
    private Random random;

    public Sorteio() {
        this.lista = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionar(T elemento) {
        this.lista.add(elemento);
    }

    public void adicionarVarios(T... elementos) {
        lista.addAll(Arrays.asList(elementos));
    }

    public void remover(T elemento) {
        this.lista.remove(elemento);
    }

    public T sorteio(){
        int pos = random.nextInt(this.lista.size());
        return lista.get(pos);
    }
}
