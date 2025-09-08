package exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um numero: ");

        numero = leitor.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }
}
