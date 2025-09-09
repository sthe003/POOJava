package br.com.polimorfismo.verificacao;

public class gerarPrimo extends numerosPrimos{

    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
