package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        int quadrado =  4 * 4;
        float pi = 3.14F;
        float circulo = pi * 4 * 2;
        int escolha = 0;

        System.out.println("Digite 1 para área do quadrado. Digite 2 para área do círculo");

        Scanner leitor = new Scanner(System.in);
        escolha = leitor.nextInt();

        if (escolha == 1){
            String mensagem = String.format("A área do quadrado é de: %d", quadrado);
            System.out.println(mensagem);
        } else {
            String mensagem2 = String.format("A área do circulo é de: %f", circulo);
            System.out.println(mensagem2);
        }


    }
}
