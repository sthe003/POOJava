package br.com.manipulandoArquivos.arquivoTituloGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Titulo {
    private String produto;
    private double preco;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {

        System.out.println("Qual o nom do produto? ");
        Scanner leitura = new Scanner(System.in);
        var busca = leitura.nextLine();

        System.out.println("Qual o preço do produto? ");
        var busca2 = Double.parseDouble(leitura.nextLine());


        Titulo titulo = new Titulo();
        titulo.setProduto(busca);
        titulo.setPreco(busca2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);


    }
}
