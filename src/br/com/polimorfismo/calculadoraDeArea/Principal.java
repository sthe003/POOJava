package br.com.polimorfismo.calculadoraDeArea;

public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular meuCalculo = new CalculadoraSalaRetangular();
        meuCalculo.setAltura(2.67);
        meuCalculo.setLargura(800);
        meuCalculo.calcularArea();
        meuCalculo.calcularPerimetro();
    }
}
