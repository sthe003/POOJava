package br.com.polimorfismo.biblioteca;

public class Livro implements Consulta{
    private String autor;
    private String livro;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    @Override
    public void consultarLivro() {
        System.out.println("Nome do autor: " + autor);
        System.out.println("Nome do livro: " + livro);
    }
}
