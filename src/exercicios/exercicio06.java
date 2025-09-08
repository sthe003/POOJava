package exercicios;

public class exercicio06 {
    public static void main(String[] args) {
        double precoOriginal = 30.99;
        double desconto = 15;

        double precoDesconto = (desconto /100)*precoOriginal;
        double total = precoOriginal - precoDesconto;

        String mensagem = String.format("O preço original é de %f. Obteve o desconto de: %f. E o total a pagar é: %f", precoOriginal, desconto, total);
        System.out.println(mensagem);
    }
}
