package br.com.polimorfismo.banco;

public class Principal {
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria();
        minhaConta.setSaldo(1000);
        minhaConta.setDinheiro(10);
        minhaConta.sacar();

        contaCorrente minhaSegundaConta = new contaCorrente();
        minhaSegundaConta.setSaldo(900);
        minhaSegundaConta.setDesconto(0.10);
        minhaSegundaConta.cobrarTarifaMensal();
    }
}
