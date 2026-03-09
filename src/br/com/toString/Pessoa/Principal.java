package br.com.toString.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Rafael");
        primeiraPessoa.setIdade(10);

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Sthefanie");
        segundaPessoa.setIdade(22);

        Pessoa terceiraPessoa = new Pessoa();
        terceiraPessoa.setNome("Michelle");
        terceiraPessoa.setIdade(42);

        ArrayList<Pessoa> listaDePessoas= new ArrayList<>();
        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);
        System.out.println("toString da pessoa: " + listaDePessoas.get(0).toString());
    }
}
