package br.com.estruturandoListas.NumerosLista;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new LinkedList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(4);
        listaDeNumeros.add(3);
        System.out.println(listaDeNumeros);

        listaDeNumeros.sort(Comparator.naturalOrder());
        System.out.println(listaDeNumeros);
    }
}
