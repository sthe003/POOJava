package br.com.estruturaDeControle.validador;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {

    try {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe sua senha: ");
        var senha = leitor.nextInt();

        System.out.println("Senha cadastrada!");

    } catch (SenhaInvalidaException e){
        System.out.println("Senha com menos de 8 caracteres " +e.getMessage());
    }
    }
}
