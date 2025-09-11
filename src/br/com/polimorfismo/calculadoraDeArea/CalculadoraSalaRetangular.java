package br.com.polimorfismo.calculadoraDeArea;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double area;
    private double altura;
    private double largura;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public void calcularArea() {
        area = largura * altura;
        System.out.println(area);
    }

    @Override
    public void calcularPerimetro() {
    perimetro = 2 * (altura + largura);
        System.out.println(perimetro);
    }
}
