package br.com.polimorfismo.banco;

public class contaBancaria {
    private double saldo;
    private double dinheiro;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void depositar(){
        saldo = saldo + dinheiro;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void sacar(){
        saldo = saldo - dinheiro;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void consulta(){
        System.out.println("Saldo atual: " + saldo);
    }
}
