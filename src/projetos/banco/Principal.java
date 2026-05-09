package projetos.banco;

import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o limite do cartão: ");
        double limite = leitor.nextDouble();
        Credito cartao = new Credito(limite);


        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição do produto: ");
            String descricao = leitor.next();

            System.out.println("Informe o valor do produto: ");
            double valor = leitor.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada! ");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitor.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }

        System.out.println("Compras realizadas: \n");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("Saldo atual: " +cartao.getSaldo());
    }
}
