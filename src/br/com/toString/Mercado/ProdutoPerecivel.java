package br.com.toString.Mercado;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(int quantidade, double preco, String nome, String dataValidade) {
        super(quantidade, preco, nome);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(4, 12.99, "Produto C", "2026-03-09");
        System.out.println(produtoPerecivel);
    }
}
