package br.com.polimorfismo.conversorTemp;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double fahrenheit;
    private double celsius;
    private double conversao1;
    private double conversao2;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getConversao1() {
        return conversao1;
    }

    public void setConversao1(double conversao1) {
        this.conversao1 = conversao1;
    }

    public double getConversao2() {
        return conversao2;
    }

    public void setConversao2(double conversao2) {
        this.conversao2 = conversao2;
    }

    @Override
    public void celsiusParaFahrenheit() {
        conversao1 = celsius * 1.8 + 32;
        System.out.println(conversao1);
    }

    @Override
    public void fahrenheitParaCelsius() {
        conversao2 = (fahrenheit - 32) / 1.8;
        System.out.println(conversao2);
    }

}
