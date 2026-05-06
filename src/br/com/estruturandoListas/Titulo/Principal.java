package br.com.estruturandoListas.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(new Titulo("Primeiro titulo"));
        lista.add(new Titulo("Segundo titulo"));
        lista.add(new Titulo("Terceiro titulo"));

        Collections.sort(lista);

        System.out.println(lista);
    }
}
