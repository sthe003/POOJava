package br.com.toString.Agencia;

import java.util.ArrayList;

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria("Fabricio", 1899.99);
        ContaBancaria segundaConta = new ContaBancaria("Mauricio", 3200);

        ArrayList<ContaBancaria> listaDeClientes = new ArrayList<>();
        listaDeClientes.add(primeiraConta);
        listaDeClientes.add(segundaConta);

        if (primeiraConta.getSaldo() < segundaConta.getSaldo()){
            System.out.println("Maior saldo: " + segundaConta);
        } else {
            System.out.println("Maior saldo: " + primeiraConta);
        }

        for (ContaBancaria contas : listaDeClientes){
            System.out.println(contas);
        }

    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
