package br.com.toString.Mercado;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int quantidade, double preco, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Produto>notaFiscal = new ArrayList<>();

        Produto produto1 = new Produto(5, 15.99, "Sabão");
        Produto produto2 = new Produto(2, 10.99, "Detergente");


        notaFiscal.add(produto1);
        notaFiscal.add(produto2);

        System.out.println("Itens: " + notaFiscal.size());
        System.out.println("Produto na posição 0: " + notaFiscal.get(0).getNome());

        Produto produtoNovo = new Produto(3, 15.99, "novo produto");
        System.out.println(produtoNovo);

        for (Produto produto : notaFiscal){
            System.out.println(produto);

        }

    }

    @Override
    public String toString(){
        return "Nome " + nome + " Preço: " + preco + " Quantidade: "+ quantidade;
    }
}
