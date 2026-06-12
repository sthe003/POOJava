package br.com.estruturaDeControle.divisao;

//Crie um programa simples que solicita dois
// números ao usuário e realiza a divisão do
// primeiro pelo segundo. Utilize o bloco
// try/catch para tratar a exceção que pode
// ocorrer caso o usuário informe 0 como
// divisor.

import java.io.IOException;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) throws IOException {
        try
        {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Escolha um número: ");
            var numero = leitor.nextInt();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Escolha o divisor");
            var divisor = leitor2.nextInt();

            double resultado = numero / divisor;

            System.out.println("O resultado da divisão é: " + resultado);


        } catch(ArithmeticException e){
            System.out.println("Não foi possível realizar a divisão " + e.getMessage());
        }
    }
}
