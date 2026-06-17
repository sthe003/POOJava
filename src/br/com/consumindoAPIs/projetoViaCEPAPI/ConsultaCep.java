package br.com.consumindoAPIs.projetoViaCEPAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {

        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = response.body();
        System.out.println(json);

        Endereco enderecoConvertido =
                gson.fromJson(json, Endereco.class);

        return enderecoConvertido;
    }
}
