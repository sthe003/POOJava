package exercicios;

public class exercicio02 {
    //crie um programa que realize a média de notas decimais
public static void main(String[] args) {
    double nota1 = 4.5;
    double nota2 = 7.8;

    int resultado = (int) ((nota1 + nota2) / 2);

    String mediaMensagem = String.format("A média das notas é: %d", resultado);

    System.out.println(mediaMensagem);
}
}
