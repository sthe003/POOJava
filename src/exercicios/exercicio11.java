package exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        System.out.println("Digite um número");

        Scanner leitor = new Scanner(System.in);
        int numeroDigitado = leitor.nextInt();
        int contador = 0;

        while (contador < 10) {
            contador++;
            int result = numeroDigitado * contador;
            String tabuada = String.format("%d x %d = %d", numeroDigitado, contador, result);
            System.out.println(tabuada);

        }
    }
}

