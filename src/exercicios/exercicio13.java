package exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3){
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do circulo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = leitor.nextInt();

            if (escolha == 1){
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitor.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do circulo: ");
                double raio = leitor.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
