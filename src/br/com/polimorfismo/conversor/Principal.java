package br.com.polimorfismo.conversor;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda converter = new ConversorMoeda();

        converter.setDolar(1);
        converter.converterDolarParaReal();
    }
}
