package br.com.consumindoAPIs.projetoViaCEPAPI;

//https://viacep.com.br/ws/01001000/json/ - link api

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        var busca = leitura.nextLine();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String endereco = "https://viacep.com.br/ws/" + busca + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Endereco enderecoConvertido =
                gson.fromJson(json, Endereco.class);

        System.out.println(enderecoConvertido);
    }
}
