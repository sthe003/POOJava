package br.com.polimorfismo.conversor;

public class ConversorMoeda implements ConversaoFinanceira{
    public double conversao;
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public void converterDolarParaReal() {
        conversao = dolar * 5.42;
        System.out.println(conversao);
    }

}
