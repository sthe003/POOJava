package br.com.estruturaDeControle.consultandoGithub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGithubAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        try{
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual usuário deseja consultar? ");
        var usuario = leitor.nextLine();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/" + usuario))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 404){
                throw new ErroConsultaGitHubException("O usuário não foi encontrado!");
            }
            System.out.println(response.body());

    } catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
