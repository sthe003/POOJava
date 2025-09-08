package exercicios;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Digite dois números inteiros: ");

        numero1 = leitor.nextInt();
        numero2 = leitor2.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais, não há maior");
        } else if (numero1 != numero2 && numero1 > numero2) {
            String mensagem = String.format("Os números são diferentes, %d é maior que %d", numero1, numero2);
            System.out.println(mensagem);
        } else {
            String mensagem2 = String.format("Os números são diferentes, %d é menor que %d", numero1, numero2);
            System.out.println(mensagem2);
        }
    }
}
