package br.com.toString.Compras;

import java.util.ArrayList;

public class Lista{

    public static void main(String[] args) {
        Produto primeiroProduto = new Produto("Arroz", 15.99, 3);
        Produto segundoProduto = new Produto("Feijão", 19.99, 2);
        Produto terceiroProduto = new Produto("Ovo", 9.99, 1);

        ArrayList<Produto>listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(primeiroProduto);
        listaDeProdutos.add(segundoProduto);
        listaDeProdutos.add(terceiroProduto);

        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }

    }




}
