package br.com.polimorfismo.conversorTemp;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao minhaConversao = new ConversorTemperaturaPadrao();
        minhaConversao.setCelsius(1);
        minhaConversao.setFahrenheit(1);
        minhaConversao.celsiusParaFahrenheit();
        minhaConversao.fahrenheitParaCelsius();
    }
}
