package br.com.consumindoAPIs.googleBooksAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class buscandoLivro {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual livro você procura? ");
        var busca = leitura.nextLine().replace(" ", "+");

        //escondendo a Key
        String apiKey = System.getenv("GOOGLE_BOOKS_KEY");
        String endereco = "https://www.googleapis.com/books/v1/volumes?q="
                + busca
                + "&key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
