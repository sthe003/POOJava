package br.com.consumindoAPIs.projetoViaCEPAPI;

public record Endereco(String cep, String logradouro,
                       String complemento, String bairro,
                       String estado, int ddd) {
}
