package exercicios;

import java.util.Random;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;


        while (tentativas < 5) {
            System.out.println("Digite um numero entre 0 e 100");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Acertou!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor");
            } else {
                System.out.println("O numero digitado é maior");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Errou :(");
        }
    }
}