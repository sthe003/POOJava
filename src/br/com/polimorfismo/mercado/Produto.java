package br.com.polimorfismo.mercado;

public class Produto implements Desconto{
    private double preco;
    private double resultado;
    private String produto;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    @Override
    public void aplicarDesconto() {
        if (resultado >= 100){
            System.out.println("Total da compra: " + resultado * 0.9);
        } else {
            System.out.println("Total da compra: " + resultado);
        }

    }

}
