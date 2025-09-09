package br.com.polimorfismo.verificacao;

public class Principal {
    public static void main(String[] args) {
        verificarPrimo verificador = new verificarPrimo();
        verificador.verificarSeEhPrimo(17);

        gerarPrimo gerador = new gerarPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        numerosPrimos numerosPrimos = new numerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
