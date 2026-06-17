package br.com.consumindoAPIs.projetoViaCEPAPI;

//https://viacep.com.br/ws/01001000/json/ - link api

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        var busca = leitura.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco(busca);

        GeradorDeArquivo gerador = new GeradorDeArquivo();
        gerador.salvaJson(novoEndereco);
    }
}
