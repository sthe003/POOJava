package br.com.toString.Mercado;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto primeiroProduto = new Produto();
        primeiroProduto.setNome("farinha");
        primeiroProduto.setPreco(9.99);
        primeiroProduto.setQuantidade(2);

        Produto segundoProduto = new Produto();
        segundoProduto.setNome("nescau");
        segundoProduto.setPreco(14.99);
        segundoProduto.setQuantidade(1);

        Produto terceiroProduto = new Produto();
        terceiroProduto.setNome("ovos");
        terceiroProduto.setPreco(10.00);
        terceiroProduto.setQuantidade(1);

        ArrayList<Produto>notaFiscal = new ArrayList<>();
        notaFiscal.add(primeiroProduto);
        notaFiscal.add(segundoProduto);
        notaFiscal.add(terceiroProduto);

        System.out.println(notaFiscal);
    }
}
