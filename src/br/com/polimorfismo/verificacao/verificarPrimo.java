package br.com.polimorfismo.verificacao;

public class verificarPrimo extends numerosPrimos{

    public void verificarSeEhPrimo(int numero){
        if (verificarPrimalidade(numero)){
            System.out.println(numero + "é primo");
        } else {
            System.out.println(numero + "não é primo");
        }
    }
}
