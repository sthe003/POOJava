package br.com.conversaoJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Pessoa (String nome, int idade, String cidade){}

public class conversaoJson {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rafael\",\"cidade\":\"São Paulo\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        //converte o json em objeto java
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
