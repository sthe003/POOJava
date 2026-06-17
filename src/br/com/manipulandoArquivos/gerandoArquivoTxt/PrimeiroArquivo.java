package br.com.manipulandoArquivos.gerandoArquivoTxt;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrimeiroArquivo {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Escreva o conteúdo a ser gravado: ");
        var busca = data.nextLine();

        try (FileWriter writer = new FileWriter("arquivo.txt")){
            writer.write(busca);
            System.out.println("Conteúdo gravado! " + busca);
        } catch (IOException e){
            System.out.println("Error!");
        }

    }
}
