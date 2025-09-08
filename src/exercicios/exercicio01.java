package exercicios;

public class exercicio01 {
    public static void main(String[] args) {
        int temperaturaEmCelsius = 30;
        int temperaturaEmFahrenheit = (int) ((double) temperaturaEmCelsius * 1.8 + (double) 32.0F);
        String mensagem = String.format("A temperatura de %d Celsius é %d em Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagem);
    }
}