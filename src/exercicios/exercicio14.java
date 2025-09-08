package exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        String mensagem = String.format("O fatorial de %d é %d", numero, fatorial);
        System.out.println(mensagem);
    }
}
