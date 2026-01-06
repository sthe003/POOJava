package br.com.polimorfismo.mercado;

public class Principal {
    public static void main(String[] args) {
    Produto meuProduto = new Produto();
    meuProduto.setProduto("Frigideira");
    meuProduto.setResultado(200);
    meuProduto.aplicarDesconto();
    }
}
