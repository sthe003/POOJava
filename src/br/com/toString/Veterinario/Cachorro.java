package br.com.toString.Veterinario;

import java.util.ArrayList;

public class Cachorro extends Animal{


    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Cristal", 3);
        Cachorro outroCachorro = new Cachorro("Pitucha",10);

        ArrayList<Animal>listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(meuCachorro);
        listaDeAnimais.add(outroCachorro);

        for (Animal item : listaDeAnimais){
            System.out.println(item.getNome());
            if (item instanceof Cachorro cachorro){
                System.out.println("Lista de animais: " + listaDeAnimais);
            }
        }
    }

}
