package br.com.toString.Geometria;

import java.util.ArrayList;

public class Objetos implements Forma {
    private String nome;
    private double altura;
    private double largura;
    private double area;

    public Objetos(String nome, double altura, double largura) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void CalcularArea() {
        area = altura * largura;

    }

    public static void main(String[] args) {
        Objetos primeiroObjeto = new Objetos("circulo", 15, 17);
        Objetos segundoObjeto = new Objetos("quadrado", 2, 4);

        ArrayList<Objetos> listaDeObjetos = new ArrayList<>();
        listaDeObjetos.add(primeiroObjeto);
        listaDeObjetos.add(segundoObjeto);


        for (Objetos objeto : listaDeObjetos){
            objeto.CalcularArea();
            System.out.println(objeto);
        }
    }



    @Override
    public String toString() {
        return "Objetos{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", area=" + area +
                '}';
    }
}
