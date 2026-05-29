package br.com.consumindoAPIs.googleBooksAPI.coingeckoAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class consultandoCripto {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual Criptomoeda você quer consultar? ");
        var consulta = leitura.nextLine().replace(" ", "+");

        String apiKey = System.getenv("COINGECKO_API");
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids="
                + consulta
                + "&vs_currencies=brl"
                + "&x_cg_demo_api_key="
                + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
