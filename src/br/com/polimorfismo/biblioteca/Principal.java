package br.com.polimorfismo.biblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro meuLivro = new Livro();
        meuLivro.setAutor("Kafka");
        meuLivro.setLivro("A Metamorfose");
        meuLivro.consultarLivro();
    }
}
