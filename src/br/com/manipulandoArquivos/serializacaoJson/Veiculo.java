package br.com.manipulandoArquivos.serializacaoJson;

import com.google.gson.Gson;

public class Veiculo {
    private String nome;
    private String ano;
    private String marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        carro.setAno("2002");
        carro.setMarca("Honda");
        carro.setNome("Civic");


        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);

        System.out.println("Objeto Veiculo serializado para JSON: ");
        System.out.println(jsonVeiculo);

    }
}
