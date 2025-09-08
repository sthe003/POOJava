package exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        if (numero%2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
