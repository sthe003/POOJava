package br.com.polimorfismo.banco;

public class contaCorrente extends contaBancaria{
    private double desconto;
    private double saldoAtual;


    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    public void cobrarTarifaMensal(){
        saldoAtual = getSaldo();
        saldoAtual = saldoAtual - desconto;
        setSaldo(saldoAtual);

        System.out.println(saldoAtual);

    }


}
