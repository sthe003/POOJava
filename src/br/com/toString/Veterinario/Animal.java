package br.com.toString.Veterinario;

public class Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
